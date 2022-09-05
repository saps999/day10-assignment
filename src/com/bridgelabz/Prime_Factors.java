package com.bridgelabz;

import java.util.Scanner;

public class Prime_Factors {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = sc.nextInt();
        System.out.println("Prime factors of the given number " + a + " are: ");

        for (int i = 2; i < a; i++) {
            while (a % i == 0) {
                System.out.print(i + " ");
                a = a / i;
            }
        }

        if (a > 2) {
            System.out.print(a);
        }
    }
}