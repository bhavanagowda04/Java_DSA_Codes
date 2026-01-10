package com.practice05;
//https://leetcode.com/problems/shuffle-the-array/description/

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,8};
        int n = nums.length/2;
        System.out.println(Arrays.toString(shuffle(nums, n)));

    }

    static int[] shuffle(int[] nums, int n) {
        n = nums.length/2;
        int x = 0;
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length/2; i++){
            ans[x] = nums[i];
            ans[x + 1] = nums[n];
            x = x+2;
            n++;
        }
        return ans;
    }
}
