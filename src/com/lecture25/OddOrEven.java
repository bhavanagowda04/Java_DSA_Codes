package com.lecture25;

public class OddOrEven {
    static void main(String[] args) {
        int n = 77;
        System.out.println(isodd(n));
    }
    private static boolean isodd(int n){
        return (n & 1) == 1;
    }
}
