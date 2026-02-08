package com.Leetcodes;
//https://leetcode.com/problems/power-of-three/description/?envType=problem-list-v2&envId=math

class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n == 1) return true;     
        if (n <= 0 || n % 3 != 0) return false;
        return isPowerOfThree(n / 3); 
    }
}