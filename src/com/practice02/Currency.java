package com.practice02;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Rupees: ");
        float rupees = sc.nextInt();
//        float dollar;
//        float Onedollar = 80;

        float dollar = rupees / 80;

        System.out.println(dollar);

    }
}
