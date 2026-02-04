package com.practice07;
//https://leetcode.com/problems/sort-array-by-parity/

import java.util.Arrays;

class SortArrayByParity {
    static void main(String[] args) {
        int[] nums = {1,3,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
    static int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[nums.length];
        int j = 0;
        int k = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 != 0) {
                    ans[k] = nums[i];
                    k--;
                }else{
                    ans[j] = nums[i];
                    j++;
                }
        }
        return ans;
    }
}