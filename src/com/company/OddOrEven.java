package com.company;
import java.util.Scanner;
public class OddOrEven {

    public static void main(String[] args) {
        int Var = 0;
        while (Var == 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number:");
            int number = input.nextInt();
            if ((number % 2) == 0) {
                System.out.println("The number is Even");
            }
            else {
                System.out.println("The number is Odd");
            }
        }
    }
}

