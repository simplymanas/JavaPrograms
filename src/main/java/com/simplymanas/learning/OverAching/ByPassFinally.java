package com.simplymanas.learning.OverAching;


public class ByPassFinally {

    public static void main(String[] args) {
       // checkFinally();
        //checkFinallyWithException();
        //checkFinallyWithExit();
        checkFinallyWithShutDownHook();
    }


    public static void checkFinally() {
        try {
            System.out.println("Try is terminating normally.");
        } finally {
            System.out.println("Finally is called.");
        }
    }

    public static void checkFinallyWithException() {
        try {
            System.out.println("Try is terminating after throwing NullPointerException.");
            //throw new NullPointerException();
            System.exit(0);
        } finally {
            System.out.println("Finally is called.");
        }
    }

    public static void checkFinallyWithExit(){
        try {
            System.out.println("Try is terminating after calling System.exit().");
            System.exit(0);;
        }
        finally {
            System.out.println("Finally is called.");
        }
    }

    public static void checkFinallyWithShutDownHook(){
        try {
            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {
                    System.out.println("Shutdown hook is called.");
                }
            });
            System.out.println("Try is terminating after calling System.exit().");
            System.exit(5);;
        }
        finally {
            System.out.println("Finally is called.");
        }
    }
}



