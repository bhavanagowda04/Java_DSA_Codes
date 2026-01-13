package com.practice05;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

import java.util.Arrays;

class SmallerNumThanCurrent {
    static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int i = 0;
        int[] ans = new int[nums.length];
        int k = 0;
        while(i < nums.length){
            int j = 0;
            int count = 0;
            while(j <nums.length) {
                if (nums[i] > nums[j]) {
                    count++;
                }
                j++;
            }
            ans[k] = count;
            k++;
            i++;
        }
        return ans;
    }
}