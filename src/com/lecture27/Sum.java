package com.lecture27;

public class Sum {
    static void main(String[] args) {
        System.out.println(sum(111));
    }

    static int sum(int n){
        if(n == 0) {
            return 0;
        }
        return (n % 10) + sum(n /10);
    }
}
