package com.example;

import com.example.grpcConnection.CommandExecutionResult;
import com.example.grpcConnection.CommandRequest;
import com.example.grpcConnection.MongoDBConnectionGrpc;
import io.grpc.Channel;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;

public class MongoDBDriver {

    private final MongoDBConnectionGrpc.MongoDBConnectionStub asyncStub;

    public MongoDBDriver(Channel channel) {
        asyncStub = MongoDBConnectionGrpc.newStub(channel);
    }

    public CountDownLatch executeCommand() {
        System.out.println("*** Execute command");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        StreamObserver<CommandRequest> requestStreamObserver = asyncStub.executeCommand(new StreamObserver<CommandExecutionResult>() {
            @Override
            public void onNext(CommandExecutionResult commandExecutionResult) {
                System.out.println("received result code " + commandExecutionResult.getStatusCode() + ". Msg: " + commandExecutionResult.getMsg());
                System.out.println("-------------------------------------------------------");
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("RPC failed. " + throwable);
                countDownLatch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("completed");
                countDownLatch.countDown();
            }
        });

        try {

            for (int i = 0; i <1000; i++) {
                System.out.println("Sending command to mongod");
                requestStreamObserver.onNext(CommandRequest.newBuilder().setCommand("insert value " + i).build());

                Thread.sleep(1000);
            }

        } catch (RuntimeException | InterruptedException e) {
            requestStreamObserver.onError(e);
            throw new RuntimeException(e);
        }

        requestStreamObserver.onCompleted();
        System.out.println("*** Completed all commands");

        return countDownLatch;
    }
}
