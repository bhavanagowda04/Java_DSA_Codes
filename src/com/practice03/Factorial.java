package com.practice03;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fact(n));
    }

    static int fact(int n){
        int factorial = 1;
        System.out.print(n + "! = ");
        for(int i = 1; i <= n; i++ ){
            factorial = factorial * i;
            if (i != n){
                System.out.print(i + " * ");
            } else if (i == n){
                System.out.print(i);
            }
        }
        System.out.println(" = " + factorial);
        return factorial;

    }
}
