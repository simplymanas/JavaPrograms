package com.simplymanas.learning;

public class TowerOfHanoi {

    private static void TowersOfHanoi(int n, char frompeg, char topeg, char auxpeg){
        //if only 1 disk is there
        if(n==1){
            System.out.println("Move disk 1 from peg " + frompeg + " to peg " + topeg);
            return;
        }

        //move A to B
        TowersOfHanoi(n-1, frompeg,auxpeg,topeg);
        System.out.println("Move disk from peg " + frompeg + " to peg " + topeg);


        //move B to C
        TowersOfHanoi(n-1,auxpeg,topeg,frompeg);

    }

    public static void main(String[] args) {
        TowersOfHanoi(3,'A','B','C');
    }
}
