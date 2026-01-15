package com.practice05;
//https://leetcode.com/problems/build-array-from-permutation/

class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            ans[k] = nums[nums[i]];
            k++;
        }
        return ans;
    }
}