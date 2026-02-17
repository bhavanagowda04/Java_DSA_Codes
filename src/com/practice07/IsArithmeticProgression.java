package com.practice07;
//https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/description/

import java.util.Arrays;

class Solution {
    static void main(String[] args) {
        int[] arr = {3,5,1};
        System.out.println(canMakeArithmeticProgression(arr));
    }
    static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int i = 1;
        int s1= arr[1] - arr[0];
        while(i < arr.length -1){
            int j = i+1 ;
            int s2= arr[j] - arr[i];
            if(s1 != s2){
                return false;
            }
            i++;
        }
        return true;  
    }
}