package com.practice05;

public class PerfectSqr {
    static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }

    static boolean isPerfectSquare(int num) {
        int ans = (int) Math.sqrt(num);
        if( ans == Integer.parseInt(String.valueOf(num))){
            return true;
        }else {
            return false;
        }
    }
}
