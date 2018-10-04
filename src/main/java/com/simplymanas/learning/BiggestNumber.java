//biggest number from a given array
package com.simplymanas.learning;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BiggestNumber {
    public static void main(String[] args) {
        Integer a=5, b=4, c=6, d=0;

        System.out.println(getBiggestNumber(a,b,c,d));

    }

    public static int getBiggestNumber(Integer... numbers){
        List list = Arrays.asList(numbers);
        Comparable max = Collections.max(list);

        return (int)max;
    }
}
