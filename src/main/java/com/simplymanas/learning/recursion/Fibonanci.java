package com.simplymanas.learning.recursion;

public class Fibonanci {

private static int getFibonanci(int limit){
    if(limit<=0 ){ return 0;}
    if(limit==1 ){ return 1;}

    return getFibonanci(limit-1) + getFibonanci(limit-2);
}


    public static void main(String[] args) {
    for (int i=1;i<10;i++)
        System.out.println(Fibonanci.getFibonanci(i));
    }
}
