package com.simplymanas.learning.java;

public class EvenNumberTest {
    public static void main(String[] args) {
        int number = 5;
        int finishNumber = 30;
        while(number <= finishNumber) {
            if (!IsEvenNumber(number)) {
                number++;
                continue;
            }

            System.out.println("even no:" + number);
            number++;
        }
    }

    private static  boolean IsEvenNumber(int number){
        if(number%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
