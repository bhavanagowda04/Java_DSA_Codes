package com.lecture27;

public class Nto1 {
    static void main(String[] args) {
        fun(5);
        funrev(5);
        funboth(5);
    }

    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " "); //prints 54321
        fun(n - 1);
    }

    static void funrev(int n){
        if(n == 0){
            return;
        }
        funrev(n - 1);
        System.out.print(n + " "); // prints 12345
    }

    static void funboth(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        funboth(n - 1);
        System.out.print(n + " ");
    }
}
