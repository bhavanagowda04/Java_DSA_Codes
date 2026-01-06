package com.lecture25;

public class PowerOf2 {
    static void main(String[] args) {
        int n = 4;
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
