package com.lecture11;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        //Q: take input of two num and print the sum

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First num: ");
        int a = sc.nextInt();
        System.out.print("Enter second num: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);

    }
}
