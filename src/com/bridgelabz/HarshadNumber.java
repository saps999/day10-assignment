package com.bridgelabz;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int b = a;
        int sum = 0, rem;
        while (a != 0) {
            rem = a % 10;
            sum += rem;
            a = a / 10;
        }
        if (b % sum == 0) {
            System.out.println("The given number " + b + " is a Harshad number.");
        } else System.out.println("The given number " + b + " is not a Harshad number.");
    }
}
