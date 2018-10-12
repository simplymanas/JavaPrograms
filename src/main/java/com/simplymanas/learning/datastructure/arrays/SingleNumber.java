/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
 */

package com.simplymanas.learning.datastructure.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i <nums.length ; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
           return map.entrySet()
                   .stream()
                   .filter(entry -> entry.getValue()==1 )
                   .map(Map.Entry::getKey)
                   .findFirst().get();
    }

    public static void main(String[] args) {
        int[] input = {11, 11, 3, 3,4,4,4, 55,4};
        System.out.println(Arrays.toString(input));
        System.out.println(singleNumber(input));
    }
}
