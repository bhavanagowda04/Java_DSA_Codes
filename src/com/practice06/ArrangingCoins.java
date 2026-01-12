package com.practice06;
//https://leetcode.com/problems/arranging-coins/description/

class ArrangingCoins {
    static void main(String[] args) {
        System.out.println(arrangeCoins(3));
    }
    static int arrangeCoins(int n) {
        int row = 1;
        int count = 0;

        while(n >= row){
            n = n - row;
            count++;
            row++;
        }
        return count;

    }
}