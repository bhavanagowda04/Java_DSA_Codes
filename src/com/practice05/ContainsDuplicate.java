package com.practice05;
//https://leetcode.com/problems/contains-duplicate/description/

import java.util.Arrays;

class ContainsDuplicate {
    static void main(String[] args) {
        int[] nums = {0};
        int k = 1;

    }
    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length-1){
                if(nums[i] == nums[i + 1]){
                    return true;
                }
            i++;
        }
        return false;
    }
}