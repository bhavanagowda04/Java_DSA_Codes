package com.practice06;
//https://leetcode.com/problems/single-element-in-a-sorted-array/

class FindUniqueNo {
    public int singleNonDuplicate(int[] nums) {
       int unique = 0;
        for(int n : nums){
            unique ^= n;
        }

        return unique;
    }
}