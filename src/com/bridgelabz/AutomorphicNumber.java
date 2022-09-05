package com.bridgelabz;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        String n = ("" + a);
        int l = n.length();
        int sq = a * a;
        int end = sq % (int) Math.pow(10, l);
        if (end == a) {
            System.out.println("The given number " + a + " is an automorphic number.");
        } else System.out.println("The given number " + a + " is not an automorphic number.");
    }
}
