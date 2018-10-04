package com.simplymanas.learning.DesignPattern;

import java.util.Scanner;

public class PrototypePattern {
    public static void main(String[] args) {
        System.out.println("How many statue you want to create?");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();


        StatueTemplate statueTemplate = new GaneshaStatue();

    }
}
