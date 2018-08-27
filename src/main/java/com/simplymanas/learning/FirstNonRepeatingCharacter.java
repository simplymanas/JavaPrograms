package com.simplymanas.learning;

import java.util.*;

public class FirstNonRepeatingCharacter {

    public static char FirstNonRepeatingChar(String input) {

        List<Character> nonRepeating = new ArrayList<>();
        Set<Character> repeating = new HashSet<>();

        for (char chr : input.toCharArray()) {
            if (repeating.contains(chr)) {
                continue;
            }
            if (nonRepeating.contains(chr)) {
                repeating.add(chr);
                nonRepeating.remove(Character.valueOf(chr));
            } else {
                nonRepeating.add(chr);
            }
        }

        if (nonRepeating.isEmpty()) {
            return '_';
        } else {
            return nonRepeating.get(0);
        }
    }

    public static void main(String[] args) {
        System.out.println(FirstNonRepeatingChar("bcccccb"));
        System.out.println(FirstNonRepeatingChar("z"));
        System.out.println(FirstNonRepeatingChar("bacd"));
    }
}
