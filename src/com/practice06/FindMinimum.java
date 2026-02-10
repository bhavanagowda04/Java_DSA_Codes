package com.practice06;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/

import java.util.Arrays;

class FindMinimum {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}