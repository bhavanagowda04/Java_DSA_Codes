package com.practice02;


import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Number: ");
//        int a = sc.nextInt();
        int a = 153;
        int sum = 0;
        int copy = a;

            while (a > 0) {
                int rem = a % 10;
                a = a / 10;
                sum = sum + rem * rem * rem;
            }
            System.out.println(sum == copy);

    }
}



