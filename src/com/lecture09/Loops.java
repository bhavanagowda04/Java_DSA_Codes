package com.lecture09;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Q: Print number from 1 to 5
//        for (int num = 1; num <= 5; num++){
//            System.out.println(num);
//        }

        // Q: print the num from starting to ending num as per input given by user
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the ending number: ");
//        int a = sc.nextInt();
//        System.out.print("Enter the first number: ");
//        int s = sc.nextInt();
//        for (int i = s; i <= a; i++){
//            System.out.print(i + " ");
//
//        }

        //while loop
//        int n = 1;
//        while(n <= 5){
//            System.out.println(n);
//            n++;
//        }

        //do while loop
        int n = 1;
        do{
            System.out.println(n);
            n++;
        } while (n <= 5);
    }
}
