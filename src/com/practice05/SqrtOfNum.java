package com.practice05;
//https://leetcode.com/problems/sqrtx/description/
class SqrtOfNum {
    static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }
    static int mySqrt(int x) {
        int a = (int) Math.sqrt(x);
        return a;
        
    }
}