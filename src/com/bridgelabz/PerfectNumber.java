package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        int result=0;
        for (int i = 1; i <a ; i++) {
            if (a%i==0){
                result=result+i;
            }
        }
        if (result==a){
            System.out.println(a+" is a perfect number");
        } else {
            System.out.println(a+ " is not a perfect number");
        }
    }
}
