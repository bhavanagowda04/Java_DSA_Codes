package com.practice10;
//https://leetcode.com/problems/fibonacci-number/

class FibbonaciNUm {
    public int fib(int n) {
        if(n < 2){
            return n;
        }

        return fib(n-1) + fib(n-2);
    }
}