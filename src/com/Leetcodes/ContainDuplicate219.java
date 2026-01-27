package com.Leetcodes;
//https://leetcode.com/problems/contains-duplicate-ii/description/?envType=problem-list-v2&envId=array
class ContainDuplicate219 {
    static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
    static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j] && Math.abs(i - j) <= k){
                    return true;
                }

            }
        }
        return false;
    }
}