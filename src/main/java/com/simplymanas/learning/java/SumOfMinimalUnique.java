package com.simplymanas.learning.java;

import java.util.Arrays;

/**
 * Created by Manas Dash on 06/12/17 8:01 AM.
 * 100DaysOFCode
 */
public class SumOfMinimalUnique {
    public static void main(String[] args) {

        int[] inputArray = {1,4,3,3,1};
        Arrays.sort(inputArray);
        System.out.println(MinimumUniqueSum(inputArray));

    }

    public static int MinimumUniqueSum(int[] inputArray) {

        int sum = inputArray[0];
        int previous = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            int current = inputArray[i];

            if (previous >= current) {
                current = previous + 1;
            }
            sum += current;
            previous = current;
        }
        return sum;
    }
}
