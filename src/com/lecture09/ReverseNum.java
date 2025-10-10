package com.lecture09;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int ans = 0;

        while(n > 0) {
            int temp = n % 10;
            ans = ans * 10 + temp;
            n = n/10;
        }
        System.out.println(ans);
    }

}
