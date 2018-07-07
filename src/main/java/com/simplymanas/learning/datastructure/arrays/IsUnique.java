package com.simplymanas.learning.datastructure.arrays;

import java.util.HashSet;

public class IsUnique {

    public static void main(String[] args) {
        if (isUnique("The quick brown f"))
            System.out.println("unique string");
        else
            System.out.println("not unique");
    }

    public static boolean isUnique(String input) {
        HashSet<Character> uniqueCharCount = new HashSet<>();
        //int  count=0;

        for (Character c : input.toCharArray()) {
           // System.out.println("reading " + c + " inside the loop: " + count++ );
            if(Character.isWhitespace(c))continue;

            if (uniqueCharCount.contains(c))
                return false;
            else
                uniqueCharCount.add(c);
        }
        return true;
    }
}
