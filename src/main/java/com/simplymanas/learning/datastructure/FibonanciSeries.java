package com.simplymanas.learning.datastructure;

public class FibonanciSeries {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            System.out.println(printFibonanciSeries(i));
        }
    }

    public static long   printFibonanciSeries(int limit){

        return limit <= 1 ? limit : printFibonanciSeries(limit-1) + printFibonanciSeries(limit-2);
    }
}
