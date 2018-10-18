package com.simplymanas.learning.recursion;

public class StringPermutation {

    private static void stringPermutation(String input) {

        getAllPermutationOfAString(input, "");
    }

    private static void getAllPermutationOfAString(String input, String prefix) {
        if (input.length() == 0) {
            System.out.println(prefix);
        }
        else {

            for (int i = 0; i < input.length(); i++) {
               String rem = input.substring(0, i) + input.substring(i + 1);
                getAllPermutationOfAString(rem, prefix + input.charAt(i));
            }
        }
    }

    public static void main(String[] args) {

        StringPermutation.stringPermutation("JAVA");
    }
}

