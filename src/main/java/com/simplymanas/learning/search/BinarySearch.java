package com.simplymanas.learning.search;

public class BinarySearch {

    static int binSearch(int[] a, int key) {
        return binSearch(a,key, 0,a.length);
    }
    static int binSearch(int[] a, int key, int low, int high){
        if (low > high) {
            return -1;
        }

        int mid = low + ((high - low) / 2);
        if (a[mid] == key) {
            return mid;
        } else if (key < a[mid]) {
            return binSearch(a, key, low, mid - 1);
        } else {
            return binSearch(a, key, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 6, 7, 819, 28, 37, 46, 50, 69, 78, 95};
        System.out.println(binSearch(a, 69));
    }
}

