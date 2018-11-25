/*
Write a function that takes a string as input and returns the string reversed.

Example 1:

Input: "hello"
Output: "olleh"
Example 2:

Input: "A man, a plan, a canal: Panama"
Output: "amanaP :lanac a ,nalp a ,nam A"
 */
package com.simplymanas.learning.String;

import java.util.Arrays;

public class ReverseString {
    public static String reverseString(String s) {
        return  new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("A man, a plan, a ca nalP a nam a"));
        System.out.println(reverse("Madam ji"));
    }

    public static String reverse(String input){
        int length=input.length();
        int last = length-1;
        char[] inputArray;
        inputArray= input.toCharArray();


        for (int i = 0; i <length/2 ; i++) {
            char c = inputArray[i];
            inputArray[i]=inputArray[last-i];
            inputArray[last-i]=c;
        }

        return Arrays.toString(inputArray);
    }
}
