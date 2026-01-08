package com.practice05;
//https://leetcode.com/problems/valid-perfect-square/description/

public class PerfectSqr {
    static void main(String[] args) {
        int num = 14;
        System.out.println(isPerfectSquare(num));
    }

    static boolean isPerfectSquare(int num) {
        int s = 0;
        int e = num;
        while( s <= e){
            int m = s + (e - s)/ 2;
            if(m * m == num){
                return true;
            }
            if(m * m > num){
                e = m - 1;
            } else{
                s = m + 1;
            }
        }
        return false;
    }
}
