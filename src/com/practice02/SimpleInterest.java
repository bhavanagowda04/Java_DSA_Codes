package com.practice02;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        float p = sc.nextFloat();
        System.out.print("Enter the time in year: ");
        float t = sc.nextFloat();
        System.out.print("Enter the rate: ");
        float r = sc.nextFloat();

        float si= (p * t * r)/100;

        System.out.println("The simple interest is " + si);

    }
}
