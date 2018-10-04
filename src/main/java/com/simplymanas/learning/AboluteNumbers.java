package com.simplymanas.learning;

public class AboluteNumbers {

    private static int countAbsoluteNumbers(int[] array) {

        Integer lastNumberFromLeft = null;
        int count = 0;
        int innerIndex = array.length - 1;
        for (int i = 0; i < innerIndex + 1; ++i) {
            if (lastNumberFromLeft == null || Math.abs(array[i]) != Math.abs(lastNumberFromLeft)) {
                if (array[i] < 0) {
                    lastNumberFromLeft = array[i];
                } else {
                    lastNumberFromLeft = -array[i];
                }
                ++count;
                Integer lastNumberFromRight = null;
                for (; innerIndex > i; --innerIndex) {
                    if (Math.abs(array[innerIndex]) > Math.abs(lastNumberFromLeft)) {
                        if ((lastNumberFromRight == null) || (lastNumberFromRight != null && Math.abs(array[innerIndex]) != lastNumberFromRight)) {

                            ++count;
                        }
                        lastNumberFromRight = array[innerIndex];
                    } else if (Math.abs(array[innerIndex]) != Math.abs(lastNumberFromLeft)) {
                        break;
                    }
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] inputArray = new int[]{ 1,4,50,6,1,4,7,0,9,-49 };
        System.out.println(inputArray.length);
        System.out.println(countAbsoluteNumbers(inputArray));
    }

}
