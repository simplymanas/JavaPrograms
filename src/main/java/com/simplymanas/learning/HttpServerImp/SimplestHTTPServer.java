package com.simplymanas.learning.HttpServerImp;

import java.net.ServerSocket;

@SuppressWarnings("InfiniteLoopStatement")
public class SimplestHTTPServer {

    public static void main(String[] args) throws Exception {

        int count = 0;
        do {
            (new ServerSocket(9000)).accept();

            System.out.println(
                    "Listening for connection on port 9000 ...."
                            + count++
                            + " "
            );
        }

        while (true) ;

    }
}




