package com.simplymanas.learning;

/**
 * Created by Manas Dash on 08/12/17 6:27 AM.
 * 100DaysOFCode
 */
public class LambdaTest {
    public static void main(String[] args) {
        //  @Override
        Runnable runnable = () -> System.out.println("runnable test1");

        //Running with Lambda

        Runnable runnableWithLambda  = ()-> System.out.println("runnable with lambda");

        runnable.run();
        runnableWithLambda.run();

    }
}

