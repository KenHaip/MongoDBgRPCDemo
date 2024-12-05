package com.example;

import com.example.grpcConnection.MongoDBConnectionGrpc;
import com.example.grpcConnection.ReplicateRequest;
import com.example.grpcConnection.ReplicateResult;
import io.grpc.Channel;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;

public class OplogFetcher {
    private final MongoDBConnectionGrpc.MongoDBConnectionStub asyncStub;

    public OplogFetcher(Channel channel) {
        asyncStub = MongoDBConnectionGrpc.newStub(channel);
    }

    public CountDownLatch fetchOplog() throws InterruptedException {
        System.out.println("*** Fetching oplog ***");
        final CountDownLatch countDownLatch = new CountDownLatch(1);

        StreamObserver<ReplicateRequest> requestStreamObserver = asyncStub.replicateOplog(new StreamObserver<ReplicateResult>() {
            @Override
            public void onNext(ReplicateResult replicateResult) {
                if(!replicateResult.getOplogsList().isEmpty()) {
                    System.out.println("Received oplog from primary");
                }

                replicateResult.getOplogsList().forEach(oplog -> {
                    System.out.println(oplog.getOplogId() + " -- " + oplog.getCommand());
                });

                System.out.println("-------------------------------------------------------");
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        });

        for (int i = 0; i < 1000; i++) {
            System.out.println("Fetching oplog from primary " + i + " attempt.");
            requestStreamObserver.onNext(ReplicateRequest.newBuilder().setMsg("getMore").setLastOplogApplied("1732825190"+i).build());
            Thread.sleep(5000);
        }

        requestStreamObserver.onCompleted();
        System.out.println("*** Completed all commands");

        return countDownLatch;
    }
}
