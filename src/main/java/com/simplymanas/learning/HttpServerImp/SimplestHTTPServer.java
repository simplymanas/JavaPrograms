package com.simplymanas.learning.HttpServerImp;

import java.net.ServerSocket;
import java.net.Socket;

public class SimplestHTTPServer {

    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080 ....");

        int count = 0;
        do {
            try (Socket socket = server.accept()) {
                System.out.println("listening " + count);
                System.out.println(socket.getInetAddress().toString());

                count++;
            }
        } while (true);
    }
}




