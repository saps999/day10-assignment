package com.bridgelabz;

import java.util.Scanner;

public class FriendlyPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();

        int sum1 = Divisors(num1);
        int sum2 = Divisors(num2);

        if (sum1 / num1 == sum2 / num2)
            System.out.println(num1 + " & " + num2 + " are Friendly pairs");
        else
            System.out.println(num1 + " & " + num2 + " are not Friendly pairs");
    }

    static int Divisors(int num) {

        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum = sum + i;
        }
        return sum;
    }
}
