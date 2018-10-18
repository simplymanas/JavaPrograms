/*
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
 */

package com.simplymanas.learning.datastructure.arrays;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOneToArray(int[] digits) {
        int[] result = new int[digits.length];
        int carry = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i]  + carry;

            if (sum == 10) {

                result[i] = 0;
                carry=1;
            } else {
                result[i] = sum;
                carry = 0;
            }
            sum = 0;
        }
        if (carry == 1) {
            result = new int[digits.length + 1];
            result[0] = 1;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input1 = {4, 9, 9};

        int[] input2 = {9};

        System.out.println(Arrays.toString(plusOneToArray(input2)));
    }
}

