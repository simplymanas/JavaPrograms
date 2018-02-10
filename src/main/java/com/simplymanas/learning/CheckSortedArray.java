package com.simplymanas.learning;

public class CheckSortedArray {

    public static void main(String[] args) {
        int[] Arr =  {1,2,2,3,4,6,5};

        System.out.println(IsArrayInSortedOrder(Arr,Arr.length));
    }

    public static boolean IsArrayInSortedOrder(int[] Array, int length) {
        return 1 == length || 2 == length || ((Array[length - 1] >= Array[length - 2]) && IsArrayInSortedOrder(Array, length - 1));
    }
}

