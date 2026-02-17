package com.practice07;
//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

import java.util.Arrays;

class MaxProduct {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int max1 = nums[nums.length-1];
        int max2 = nums[nums.length-2];
        return ((max1-1) * (max2-1));
    }
}