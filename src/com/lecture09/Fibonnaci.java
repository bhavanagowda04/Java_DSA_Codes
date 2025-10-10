package com.lecture09;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ending number: ");
        int n = sc.nextInt();
        int i  = 0;
        int j  = 1;
        int count = 2;

        while(count <= n){
            int temp  = j;
            j  = i + j;
            i  = temp;
            count++;
        }

        System.out.println(j);
    }
}
