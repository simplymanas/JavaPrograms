package com.simplymanas.learning;

public class TinyURL {

    private static String baseURL;
    private static Object[] expiryDate;

    public static String GetTinyURL(String baseURL, Object... expiryDate){
        TinyURL.baseURL = baseURL;
        TinyURL.expiryDate = expiryDate;

        return null;
    }
}
