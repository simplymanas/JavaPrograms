package com.simplymanas.learning.sorting;

public class MergeSort {

    private int[] arrayToSort;
    private int[] mergeArray;
    private int length;

    public static void main(String[] args) {
        int[] inputArr = {45, 23, 11, 89, 77, 98, 4, 28, 65, 43};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(inputArr);
        for (int i : mergeSort.arrayToSort) {
            System.out.print(i);
            System.out.print(" ");
        }

    }

    public void sort(int inputArr[]) {
        this.arrayToSort = inputArr;
        this.length = inputArr.length;
        this.mergeArray = new int[length];
        performMergeSort(0, length - 1);
    }

    public void performMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            performMergeSort(lowerIndex, middle);
            performMergeSort(middle + 1, higherIndex);
            merge(lowerIndex, middle, higherIndex);
        }
    }

    public void merge(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {

            mergeArray[i] = arrayToSort[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (mergeArray[i] <= arrayToSort[j]) {
                arrayToSort[k] = mergeArray[i];
                i++;
            } else {
                arrayToSort[k] = mergeArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            arrayToSort[k] = mergeArray[i];
            k++;
            i++;
        }

    }
}



