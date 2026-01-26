package com.Leetcodes;
//https://leetcode.com/problems/single-number/description/?envType=problem-list-v2&envId=array

public class FindUniqueNum {
    static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 3, 4, 6, 1};
        System.out.println(unique(arr));
    }

     static int unique(int[] arr) {
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }

        return unique;
    }

}
