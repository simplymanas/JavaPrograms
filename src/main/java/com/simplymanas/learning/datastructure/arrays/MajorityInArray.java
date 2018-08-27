package com.simplymanas.learning.datastructure.arrays;

/*
The number appears more than or equal to n/2

2 ,3, 1, 2,2

Result: 1


2,3,1,2,4

Result : 0

 */


import java.util.HashMap;
import java.util.Map;

public class MajorityInArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,2};
        System.out.println(
         HasMajority(arr));


    }

    public  static boolean  HasMajority(int[] array){

        Map<Integer,Integer> hashMap = new HashMap();
        boolean hasMajority=false;

        int Majority = array.length/2;

        for (int i = 0; i < array.length; i++) {
            if(hashMap.containsKey(array[i])) {
                hashMap.put(array[i], hashMap.get(array[i]) + 1);
            }
            else{
                hashMap.put(array[i],   1);
            }
        }

        for (Map.Entry<Integer, Integer> val : hashMap.entrySet()){
            if (val.getValue() >= Majority){
                hasMajority = true;
            }
        }

        return hasMajority;
    }
}
