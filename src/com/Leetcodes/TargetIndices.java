package com.Leetcodes;
//https://leetcode.com/problems/find-target-indices-after-sorting-array/description/?envType=problem-list-v2&envId=array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TargetIndices {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                ans.add(i);
            }
        }
        return ans;
    }
}