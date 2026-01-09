package com.lecture27;

public class Sum {
    static void main(String[] args) {
        System.out.println(sum(111));
    }

    static int sum(int n){
        if(n <= 1) {
            return 1;
        }
        return n % 10 + sum(n /10);
    }
}
