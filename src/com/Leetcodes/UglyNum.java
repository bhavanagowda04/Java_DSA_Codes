package com.Leetcodes;
//https://leetcode.com/problems/ugly-number/?envType=problem-list-v2&envId=math

class UglyNum {
    static void main(String[] args) {
        int n = 0;
        System.out.println(isUgly(n));
    }
    static boolean isUgly(int n) {
        while(n % 2 == 0){
            n = n/2;
        }
        while(n % 3 == 0){
            n = n/3;
        }
        while(n % 5 == 0){
            n = n/5;
        }
        if(n == 1){
            return true;
        }else {
            return false;
        }
    }
}