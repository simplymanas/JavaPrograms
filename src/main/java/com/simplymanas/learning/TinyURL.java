package com.simplymanas.learning;

import java.util.Date;

public class TinyURL {

    private static String baseURL;
    private static Object[] expiryDate;

    public static String GetTinyURL(String baseURL, Object... expiryDate){
        TinyURL.baseURL = baseURL;
        TinyURL.expiryDate = expiryDate;

        return null;
    }
}
