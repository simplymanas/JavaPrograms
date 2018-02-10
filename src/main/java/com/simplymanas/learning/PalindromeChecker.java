package com.simplymanas.learning;

import java.util.Scanner;

/**
 * Created by Manas Dash on 13/11/17 6:29 AM.
 * Learning
 * @author : Manas Dash
 */
class PalindromeChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = input.next();
        System.out.println(isPalindrome(word, 0, word.length()));
    }

//    private static boolean isPalindrome(String word) {
//        if (word.length() <= 1) {
//            return true;
//        }
//
//        char firstChar = word.charAt(0);
//        char lastChar = word.charAt(word.length() - 1);
//
//        return firstChar == lastChar && isPalindrome(word.substring(1, word.length() - 1));
//    }


    private static boolean isPalindrome(String word, int lower, int upper) {
        if (upper <= lower) {
            return true;
        }

        char firstChar = word.charAt(lower); //m
        char lastChar = word.charAt(upper); //m

        return firstChar == lastChar && isPalindrome(word, lower + 1, upper - 1);
    }
}
