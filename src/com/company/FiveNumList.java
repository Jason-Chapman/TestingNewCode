package com.company;

import java.util.Scanner;

public class FiveNumList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] userNums = {0, 0, 0, 0, 0};
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            userNums[i] = input.nextInt();
        }
    }
}
