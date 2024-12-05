package com.example;

import com.example.grpcConnection.*;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class MongoDBServer {
    private final int port;
    private final Server server;

    public static Queue<String> oplog;

    public MongoDBServer(int port) {
        this.port = port;
        server = Grpc.newServerBuilderForPort(port, InsecureServerCredentials.create()).addService(new MongoDBService()).build();
        this.oplog = new LinkedList<>();
    }

    public void start() throws IOException {
        server.start();
        System.out.println(("MongoDB Server started, listening on " + port));
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                try {
                    MongoDBServer.this.stop();
                } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
                System.err.println("*** server shut down");
            }
        });
    }

    public void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    private static class MongoDBService extends MongoDBConnectionGrpc.MongoDBConnectionImplBase {
        @Override
        public StreamObserver<CommandRequest> executeCommand(StreamObserver<CommandExecutionResult> responseObserver) {
            return new StreamObserver<CommandRequest>() {
                @Override
                public void onNext(CommandRequest commandRequest) {
                    System.out.println("Received command " + commandRequest.getCommand());
                    System.out.println("Executing command ...");
                    System.out.println("Execution done. Sending back result");
                    System.out.println("-------------------------------------------------------");

                    responseObserver.onNext(CommandExecutionResult.newBuilder().setStatusCode(200).setMsg("command {" +commandRequest.getCommand()+ "} success!").build());
                    oplog.add(commandRequest.getCommand());
                }

                @Override
                public void onError(Throwable throwable) {
                    System.out.println("Error executing command");
                }

                @Override
                public void onCompleted() {
                    System.out.println("Completed executing command");
                }
            };
        }

        @Override
        public StreamObserver<ReplicateRequest> replicateOplog(StreamObserver<ReplicateResult> responseObserver) {
            return new StreamObserver<ReplicateRequest>() {
                @Override
                public void onNext(ReplicateRequest replicateRequest) {
                    System.out.println("------------Fetch oplog request received------------");

                    List<Oplog> oplogList = new ArrayList<>();

                    while(!oplog.isEmpty()) {
                        oplogList.add(Oplog.newBuilder().setCommand(oplog.poll()).setOplogId(String.valueOf(System.currentTimeMillis())).build());
                    }
                    responseObserver.onNext(ReplicateResult.newBuilder().addAllOplogs(oplogList).build());
                }

                @Override
                public void onError(Throwable throwable) {
                    System.out.println("Error executing command");
                }

                @Override
                public void onCompleted() {
                    System.out.println("Completed executing command");
                }
            };
        }
    }
}
