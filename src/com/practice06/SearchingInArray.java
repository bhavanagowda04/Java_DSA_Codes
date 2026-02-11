package com.practice06;
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

import java.util.Arrays;

class SearchingInArray {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == nums[mid]){
                return true;
            }else if(target < nums[mid]){
                end = mid -1;
            } else if(target > nums[mid]){
                start = mid + 1;
            }else{
                return false;
            }

        }
        return false;
    }
}