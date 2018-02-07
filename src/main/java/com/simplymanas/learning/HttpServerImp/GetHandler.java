package com.simplymanas.learning.HttpServerImp;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetHandler implements HttpHandler {

    public void handle(HttpExchange httpExchange) throws IOException {
        byte [] response = "<h1>You have called the Get method</h1>".getBytes();

        httpExchange.sendResponseHeaders(200, response.length);

        OutputStream outputStream = httpExchange.getResponseBody();
        outputStream.write(response);

        //For the server side logging
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dateTimeFormatter.format(LocalDateTime.now()) + ": Get method called " );

        outputStream.close();
    }
}
