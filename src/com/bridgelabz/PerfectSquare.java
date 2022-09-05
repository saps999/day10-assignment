package com.bridgelabz;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int temp = 0;
        for (int i = 1; i < a; i++) {
            if (a == i * i) {
                temp += 1;
            }
        }
        if (temp > 0) {
            System.out.println("The given number " + a + " is a perfect square.");
        } else System.out.println("The given number " + a + " is not a perfect square.");
    }
}
