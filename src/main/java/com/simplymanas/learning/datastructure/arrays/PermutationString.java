//given two string write  a method  to decide if one is a permutation of the other.



package com.simplymanas.learning.datastructure.arrays;

import java.util.Arrays;

public class PermutationString {


    public static void main(String[] args) {
        if(isPermutation("aba","bcaa"))
            System.out.println("is a permutation" );
        else
            System.out.println("not a permutation");
    }


    public static boolean isPermutation(String first, String second){

        char[] firstArray =  first.toCharArray();
        char[] secondArray = second.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);


        if(!Arrays.equals(firstArray, secondArray)){
            return false;
        }

        return true;
    }
}
