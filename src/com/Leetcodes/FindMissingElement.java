package com.Leetcodes;
//https://leetcode.com/problems/find-missing-elements/?envType=problem-list-v2&envId=array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindMissingElement {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return result;
        }

        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            int prev = nums[i - 1];
            int curr = nums[i];

            for (int num = prev + 1; num < curr; num++) {
                result.add(num);
            }
        }

        return result;
    }
}