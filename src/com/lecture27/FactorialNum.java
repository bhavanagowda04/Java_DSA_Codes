package com.lecture27;

public class FactorialNum {
    static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int n){
        if(n <= 1) {
            return 1;
        }
        return n * factorial(n -1);
    }
}
