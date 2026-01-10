package com.practice05;
//https://leetcode.com/problems/running-sum-of-1d-array/description/

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1,14,15,16,19};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    static int[] runningSum(int[] nums){
        int temp = 0;
        int[] sum = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            temp = temp + nums[i];
            sum[i] = temp;
        }
        return sum;
    }
}
