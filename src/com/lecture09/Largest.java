package com.lecture09;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        // Q: print largest number

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
