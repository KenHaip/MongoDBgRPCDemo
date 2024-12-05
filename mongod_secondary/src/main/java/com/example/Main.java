package com.example;

import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Secondary started.");
        String target = "localhost:8980";

        ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create()).build();

        try {
            OplogFetcher driver = new OplogFetcher(channel);

            CountDownLatch countDownLatch = driver.fetchOplog();
            if(!countDownLatch.await(5, TimeUnit.MINUTES)) {
                System.out.println("commands can not finish within 5 minutes");
            }

        } finally {
            channel.shutdownNow().awaitTermination(5, TimeUnit.MINUTES);
        }
    }
}
