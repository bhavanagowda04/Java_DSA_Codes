package com.practice02;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first num: ");
        int a = sc.nextInt();
        System.out.print("Enter the second num: ");
        int b = sc.nextInt();

        if( a > b){
            System.out.println("LARGEST IS " + a);
        } else{
            System.out.println("LARGEST IS " + b);
        }
    }
}
