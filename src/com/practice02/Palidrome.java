package com.practice02;

import java.util.Scanner;
//https://leetcode.com/problems/palindrome-number/submissions/1831529234/

public class Palidrome {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(pali(n));
    }

    static boolean pali(int n){
        int y = 0;
        int x = n;
        while (x > 0){
            int ans = x % 10;
            y = y * 10 + ans;
            x = x/10;
        }
        if(y == n){
            return true;
        }
        return false;
    }
}
