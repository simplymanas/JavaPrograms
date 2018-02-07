package com.simplymanas.learning.HttpServerImp;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public  class PingHandler implements HttpHandler {

    public void handle(HttpExchange httpExchange) throws IOException {
        byte [] response = "<h1>Life is 200 OK </h1>".getBytes();
        httpExchange.sendResponseHeaders(200, response.length);
        URI uri =httpExchange.getRequestURI();

        OutputStream outputStream = httpExchange.getResponseBody();
        outputStream.write(response);

        //For the server side logging
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dateTimeFormatter.format(LocalDateTime.now()) + ": A Ping test was performed from " + uri.toString());

        outputStream.close();
    }
}
