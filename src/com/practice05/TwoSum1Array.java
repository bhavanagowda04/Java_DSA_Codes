package com.practice05;

//https://leetcode.com/problems/two-sum/description/?envType=problem-list-v2&envId=array

import java.util.Arrays;

public class TwoSum1Array {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 90;

        System.out.println(Arrays.toString(twoSum(nums, target)));

    }

    static int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++ ){
            for(int j = i + 1; j < nums.length; j++ ){
                if(nums[i] + nums[j] == target ){
                    return new int[] {i , j};
                }
            }

        }
        return new int[] { -1, -1};
    }
}
