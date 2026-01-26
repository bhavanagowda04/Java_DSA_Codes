package com.Leetcodes;

class Solution {
    static void main(String[] args) {
        int[] nums = {1,-1,2,3,3,4,5};
        System.out.println(minimumPrefixLength(nums));
    }
    static int minimumPrefixLength(int[] nums) {
        int n = nums.length;
        int i = n-1;
        while(i > 0 && nums[i-1] < nums[i]){
            i--;
        }
        return i;
    }
}