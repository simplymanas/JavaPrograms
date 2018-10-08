package com.simplymanas.learning.tricky;

public class JavaTrickyQuestions {

//question1
    public static void main(String[] args) {
        foo(null);
        foo(new Object());
    }

    public static void foo(Object o) {
        System.out.println("Object impl");
    }

    public static void foo(String s) {
        System.out.println("String impl");
    }

    public static void foo(int s) {
        System.out.println("String impl");
    }
//ans
    //in case of overloading, compiler picks the most specific function.


//    //Question2
//    public static void main(String[] args) {
//
//        long longWithL = 1000 * 60 * 60 * 24 * 365L;
//        long longWithoutL = 1000 * 60 * 60 * 24 * 365;
//        System.out.println(longWithL);
//        System.out.println(longWithoutL);
//
//    }

/* answer
the compiler will do the calculation and treat it as a 32-bit integer,
since the output is outside the range of integer max value (2147483647),
the compiler will truncate the most significant bits and then assign
it to the variable.
 */
}



