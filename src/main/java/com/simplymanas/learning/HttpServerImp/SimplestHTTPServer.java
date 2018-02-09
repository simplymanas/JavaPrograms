package com.simplymanas.learning.HttpServerImp;

import java.net.ServerSocket;
import java.net.Socket;

public class SimplestHTTPServer {

    public static void main(String[] args) throws Exception {

        int count = 0;
        do {
            try (Socket socket = (new ServerSocket(8080)).accept()) {
                System.out.println(
                        "Listening for connection on port 8080 ...."
                                + count++
                                + " "
                                + socket.getInetAddress().toString());
            }
        } while (true);
    }
}




