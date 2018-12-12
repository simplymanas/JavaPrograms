package com.simplymanas.learning.datastructure.arrays;


///gurantees that length of array is always greater than equal to any number present in the array
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import  java.util.Set;

public class DuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 4,4};
        System.out.println(findDuplicates(arr));
    }

    // Return a list of duplicates in the array. To avoid using extra space,
// we flag which elements we've seen before by negating the value at
// indexed at that value in the array.
    public static List<Integer> findDuplicates(int[] arr) {
        // Use a set for results to avoid duplicates
        Set<Integer> resultSet = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            // Translate the value into an index (1 <= x <= len(arr))
            int index = Math.abs(arr[i]) - 1;

            // If the value at that index is negative, then we've already seen
            // that value so it's a duplicate. Otherwise, negate the value at
            // that index so we know we've seen it
            if (arr[index] < 0) {
                resultSet.add(Math.abs(arr[i]));
            } else {
                arr[index] = -arr[index];
            }
        }

        // Return the array to it's original state
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(arr[i]);
        }

        return new ArrayList(resultSet);
    }
}
