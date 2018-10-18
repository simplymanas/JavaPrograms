/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

package com.simplymanas.learning.datastructure.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TargetSumOfTwo {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            if (hashMap.containsKey(nums[i])) {
                result[0] = hashMap.get(nums[i]);
                result[1] = i;
                return result;
            }
            hashMap.put(target - nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] input1 = {0, 8, 0, 6, 7, 8, 9, 0};
        int[] input2 = {3,3};

        System.out.println(Arrays.toString(input2));
        System.out.println(Arrays.toString( twoSum(input2, 6)));
    }
}
