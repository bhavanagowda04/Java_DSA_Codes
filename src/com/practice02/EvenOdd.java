package com.practice02;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
//        int b = a % 2;
//
//       if( b == 0){
//            System.out.println("The number is even");
//        }else{
//            System.out.println("The number is odd");
//        }

        if (a % 2 == 0){
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}
