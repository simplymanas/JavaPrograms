package com.simplymanas.learning;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(CaluclateFactorial(10));

    }

    public static int CaluclateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * CaluclateFactorial(n - 1);
        }
    }

}
