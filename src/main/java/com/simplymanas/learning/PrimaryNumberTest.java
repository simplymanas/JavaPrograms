package com.simplymanas.learning;

public class PrimaryNumberTest {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 10; i < 50; i++)
            if (isPrime(i)) {
                count++;

                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Count is greater than 3. exiting");
                    break;
                }
            }
    }

    private static boolean isPrime(int inputNo) {
        if (inputNo == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(inputNo); i++) {
            if (inputNo % i == 0) {
                return false;
            }
        }

        //another way
//        for (int i = 2; i * i <= inputNo; i++) {
//            if (inputNo % i == 0) {
//                return false;
//            }
//        }
        return true;
    }
}


// O(root of n)