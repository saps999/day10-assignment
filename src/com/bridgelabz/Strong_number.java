package com.bridgelabz;

import java.util.Scanner;

public class Strong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int b = a;
        int rem, sum = 0;
        while (a != 0) {
            rem = a % 10;
            int factorial = 1;
            for (int i = 1; i <= rem; i++) {
                factorial *= i;
            }
            sum += factorial;
            a = a / 10;
        }
        if (b == sum) {
            System.out.println("The given number " + b + " is a strong number.");
        } else System.out.println("The given number " + b + " is not a strong number.");
    }
}
