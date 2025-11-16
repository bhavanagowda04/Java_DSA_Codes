package com.Leetcode;

//https://leetcode.com/problems/reverse-integer/submissions/1831502791/

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 234;
        System.out.println(reverse(x));
    }

    static int reverse(int x){
        int y = 0;
        while (x != 0){
            int ans = x % 10;
            y = y * 10 + ans;
            x = x/10;
        }
        return y;
    }
}
