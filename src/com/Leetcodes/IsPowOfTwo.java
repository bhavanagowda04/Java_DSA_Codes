package com.Leetcodes;
//https://leetcode.com/problems/power-of-two/description/?envType=problem-list-v2&envId=math

class IsPowOfTwo {
    static void main(String[] args) {
        int n = 24;
        System.out.println(isPowerOfTwo(n));
    }
    static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}