package com.practice07;
//https://leetcode.com/problems/contains-duplicate/description/

class Duplicates {
    static void main(String[] args) {
        int[] nums = {0};
        System.out.println(containsDuplicate(nums));
    }
    static boolean containsDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length-1){
            for (int j = i + 1 ; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    return true;
                }
            }
            i++;

        }
        return false;
    }
}