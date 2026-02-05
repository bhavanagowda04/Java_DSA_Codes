package com.practice07;
//https://leetcode.com/problems/squares-of-a-sorted-array/

import java.util.Arrays;

class Solution {
    static void main(String[] args) {
        int[] nums ={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            ans[k] = nums[i] * nums[i];
            k++;
        }
        Arrays.sort(ans);
        return ans;
    }
}