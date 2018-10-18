
/*
an array contain 1 million elements
the number 1 to 25 is repeated. sort the array.
 */
package com.simplymanas.learning.datastructure.arrays;

import java.util.Arrays;

public class MillionSort {

    public static int[] sortArray(int[] inputArray) {
        if (inputArray.length == 0) {
            return inputArray;
        }

        int[] tempArray = new int[25];
        int index = 0;

        for (int i = 0; i < inputArray.length; i++) {
            tempArray[inputArray[i] - 1]++;
        }
        for (int i = 0; i < tempArray.length; i++) {
            int j = tempArray[i];
            while (j > 0) {
                inputArray[index] = i + 1;
                index++;
                j--;
            }
        }
        return inputArray;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 24, 23, 19, 19, 20, 20, 21, 9, 8, 7, 6, 7, 8, 9, 20};
//        int[] input1 = {};
//
        System.out.println(Arrays.toString(input1));

        System.out.println(Arrays.toString(sortArray(input1)));
    }
}
