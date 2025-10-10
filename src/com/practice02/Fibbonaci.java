package com.practice02;

import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth number: ");
        int n = sc.nextInt();
        int i = 0;
        int j = 1;
        int k = i + j;
        System.out.print(i +" " + j + " ");

        while( k < n ){
            System.out.print(k + " ");
            k = i + j;
            i = j;
            j = k;
        }
    }
}
