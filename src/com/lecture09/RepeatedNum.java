package com.lecture09;

import java.util.Scanner;

public class RepeatedNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int count = 0;
        System.out.print("Enter the number to count:");
        int t = sc.nextInt();

        while (n > 0){
            int temp;
            temp = n % 10;
            if (t == temp){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
