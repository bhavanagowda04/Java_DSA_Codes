package com.lecture27;

public class Product {
    static void main(String[] args) {
        System.out.println(prod(111));
    }

    static int prod(int n){
        if(n%10 == n) {
            return n;
        }
        return (n % 10) * prod(n /10);
    }
}
