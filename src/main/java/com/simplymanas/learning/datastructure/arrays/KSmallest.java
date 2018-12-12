package com.simplymanas.learning.datastructure.arrays;

import com.sun.tools.corba.se.idl.InterfaceGen;

import java.util.HashSet;
import java.util.Set;

public class KSmallest {
    public static void main(String[] args) {
        int[] elements = {-5, -4, 0, 2, 10, 3, -3};
        System.out.println(getSmallest(elements,3));
        System.out.println(Integer.MAX_VALUE);
    }


    public static int getSmallest(int[] elements, int nSmallest) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < elements.length; i++) {

            set.add(elements[i]);
            System.out.println(set);

        }
//            if(elements[i]==smallest){
//                secondSmallest=smallest;
//            } else if (elements[i] < smallest) {
//                secondSmallest = smallest;
//                smallest = elements[i];
//            } else if (elements[i] < secondSmallest) {
//                secondSmallest = elements[i];
//            }

        //}
        //return secondSmallest;


        return 0;
    }
}
