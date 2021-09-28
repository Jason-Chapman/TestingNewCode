package com.company;

import java.util.Scanner;

public class DivAndMod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number1 = input.nextInt();
        System.out.println("Enter another number:");
        int number2 = input.nextInt();
        int output1 = (number1 / number2);
        int output2 = (number1 % number2);
        System.out.println(output1);
        System.out.println(output2);
    }
}