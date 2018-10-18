/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */

package com.simplymanas.learning.datastructure.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int index=0;
        int zeroCounter=0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                zeroCounter++;
            }
            else {
                nums[index++] = nums[i];
            }
        }
        while(zeroCounter-- >0){
            nums[index++]=0;
        }
    }

    public static void main(String[] args) {
        int[] input1 = {0, 24, 23, 19, 10, 0, 0, 21, 9, 8, 0, 6, 7, 8, 9, 0};
        System.out.println(Arrays.toString(input1));
        moveZeroes(input1);
        System.out.println(Arrays.toString(input1));
    }
}
