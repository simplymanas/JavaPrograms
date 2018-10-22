package com.simplymanas.learning.datastructure;

public class ReverseANumber {

    public static int reverse(int x) {
        if(x>Integer.MAX_VALUE || x< Integer.MIN_VALUE){return 0;}
        int z = Math.abs(x);
        int y = 0;
        long result=0;
        while (z > 0) {

            y = z % 10;
            z = z / 10;
            result = result * 10 + y;
        }
        if(((result)>Integer.MAX_VALUE)){return 0;}

        if(x<0){result = 0-result;};
        return (int)result;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(reverse(-2147483412));
    }
}
