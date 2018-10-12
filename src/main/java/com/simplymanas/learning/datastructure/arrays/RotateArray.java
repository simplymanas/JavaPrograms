/*
Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
package com.simplymanas.learning.datastructure.arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(rotate(input, 2)));

    }

    public static int[] rotate(int[] nums, int k) {
        while (k > 0) {
            int temp = nums[nums.length - 1];
            for (int i = nums.length - 2; i >= 0; i--) {
                nums[i + 1] = nums[i];
            }
            nums[0] = temp;
            k--;
            System.out.println("rotate  steps to the right:" + Arrays.toString(nums));

        }
        return nums;
    }
}


