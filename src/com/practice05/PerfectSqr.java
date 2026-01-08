package com.practice05;
//https://leetcode.com/problems/valid-perfect-square/description/

public class PerfectSqr {
    static void main(String[] args) {
        int num = 2147483647;
        System.out.println(isPerfectSquare(num));
    }

    static boolean isPerfectSquare(int num) {
        int s = 0;
        int e = num / 2;
        while( s <= e){
            int m = s + (e - s)/ 2;
            long b = (long)m * m;
            if(b == num){
                return true;
            }
            else if(b > num){
                e = m - 1;
            } else if(b < num){
                s = m + 1;
            }
        }
        return false;
    }
}
