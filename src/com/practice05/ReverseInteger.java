package com.practice05;

//https://leetcode.com/problems/reverse-integer/description/

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(reverse(x));
    }

    static int reverse(int x) {
        int y = 0;
        while (x != 0){
            int ans = x % 10;
            if(y > Integer.MAX_VALUE/10 || y < Integer.MIN_VALUE/10){
                return 0;
            }
            y = y * 10 + ans;
            x = x/10;
        }

        return y;
    }
}
