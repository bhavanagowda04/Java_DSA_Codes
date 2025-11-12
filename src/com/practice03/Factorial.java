package com.practice03;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(fact());
    }

    static int fact(){
        int factorial = 1;
        int n  = 5;
        for(int i = 1; i <= n; i++ ){
            factorial = factorial * i;
        }
        return factorial;
    }
}
