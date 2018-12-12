package com.simplymanas.learning.tricky;

public class Oddity {
    public static void main(String[] args) {
        System.out.println(isOdd(-5));
    }

    public static boolean isOdd(int input) {
        return input % 2 == 1;
    }
}





















/*//this odd check method fails for negetive number
 System.out.println(-5 % 2);
 public static boolean isOdd1(int input) {
        return (input & 1) != 0;
    }
 */

//solution
//public static boolean isOdd(int input) {
//    return input % 2 != 0;
//}