
/*
Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.



 */

package com.simplymanas.learning.datastructure.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 3, 5};
        System.out.println(Arrays.toString(input));
        System.out.println(removeDuplicates(input));
        System.out.println(Arrays.toString(input));

    }

    public static int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsValue(nums[i])) { continue; }
            else {
                map.put(j + 1, nums[i]);
                nums[j] = nums[i];
                j++;
            }
        }
        return map.size();
    }
}

