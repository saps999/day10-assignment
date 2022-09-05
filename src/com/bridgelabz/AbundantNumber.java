package com.bridgelabz;

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        if (sum > a) {
            System.out.println("The given number " + a + " is a Abundant number.");
            System.out.println("The Abundance is: " + (sum - a));
        } else System.out.println("The given number " + a + " is not a Abundant number.");
    }
}
