package com.simplymanas.learning;

public class EvenNumberTest {
    public static void main(String[] args) {
        int number = 5;
        int finishNumber = 30;
        while(number <= finishNumber) {
            if (IsEvenNumber(number)) {
                System.out.println("even no:" + number++);
            } else {
                number++;
            }
        }
    }

    private static  boolean IsEvenNumber(int number){
        return 0 == (number % 2);
    }
}
