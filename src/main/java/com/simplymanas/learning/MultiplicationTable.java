package com.simplymanas.learning;

import java.util.Arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getMultiplicationTable(10)));
    }

    public static int[] getMultiplicationTable(int number) {
        int[] result = new int[10];
        for (int i = 0; i < 10; i++) {
            result[i] = number * (i+1);
        }
        return result;
    }
}
