//generate all strings of n bit
package com.simplymanas.learning;

import java.util.Arrays;

public class StringsOfNBit {
    char[] arr;

    public static void main(String[] args) {
        StringsOfNBit stringsOfNBit = new StringsOfNBit();
        int number = 5;
        stringsOfNBit.arr = new char[number];
        stringsOfNBit.GenerateBinaryStringOfNBit(number);
    }

    public void GenerateBinaryStringOfNBit(int number) {
        if (number < 1) {
            System.out.println(Arrays.toString(arr));
        } else {
            arr[number - 1] = '0';
            GenerateBinaryStringOfNBit(number - 1);
            arr[number - 1] = '1';
            GenerateBinaryStringOfNBit(number - 1);
        }
    }
}

