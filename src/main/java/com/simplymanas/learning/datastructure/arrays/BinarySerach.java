package com.simplymanas.learning.datastructure.arrays;

import java.util.Arrays;

public class BinarySerach {

    public static int binarySearchRecursive(int[] array, int key, int low, int high) {
        if (low > high)
            return -2;

        int mid = low + ((high - low) / 2);

        if (array[mid] == key) {
            return mid;
        } else if (key < array[mid]) {
            return binarySearchRecursive(array, key, low, mid - 1);
        } else {
            return binarySearchRecursive(array, key, mid + 1, high);
        }

    }

    public static int searchBinary(int[] array, int key) {
        return binarySearchRecursive(array, key, 0, array.length - 1);
    }

    public  static  int binarySearchIterative(int[] array, int key) {

        int low = 0;

        int high = array.length - 1;

        while (low <= high) {


            int mid = low + ((high - low) / 2);


            if (array[mid] == key) {
                return mid;
            }

            if (key < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return -2;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 3, 4, 6, 8, 12, 15, 20, 24, 50, 69, 89, 100};

        System.out.println("Binary Search algorithm");
        System.out.println("input array" + Arrays.toString( inputArray));
        System.out.println();

        System.out.println("With recursive");
        System.out.println("Key(2) is at: " + searchBinary(inputArray, 2));
        System.out.println("Key(89) is at: " + searchBinary(inputArray, 89));
        System.out.println("Key(69) is at: " + searchBinary(inputArray, 69));
        System.out.println();

        System.out.println("With iterative");
        System.out.println("Key(2) is at: " + binarySearchIterative(inputArray, 2));
        System.out.println("Key(89) is at: " + binarySearchIterative(inputArray, 89));
        System.out.println("Key(69) is at: " + binarySearchIterative(inputArray, 69));

        System.out.println();
        System.out.println("Inbuilt method Arrays.BinarySearch");
        System.out.println("Key(2) is at: " + Arrays.binarySearch(inputArray, 2));
        System.out.println("Key(89) is at: " + Arrays.binarySearch(inputArray, 89));
        System.out.println("Key(69) is at: " + Arrays.binarySearch(inputArray, 69));


    }
}