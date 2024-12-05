package com.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        MongoDBServer server = new MongoDBServer(8980);
        server.start();
        server.blockUntilShutdown();

    }
}