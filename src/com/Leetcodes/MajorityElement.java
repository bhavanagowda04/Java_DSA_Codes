package com.Leetcodes;
//https://leetcode.com/problems/majority-element/description/?envType=problem-list-v2&envId=array

import java.util.Arrays;

class MajorityElement {
    static void main(String[] args) {
        int[] nums = {3,3,4};
        System.out.println(majorityElement(nums));
    }

    static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length / 2;
        int i = 0;
        int count = 1;
        while(i < nums.length -1){
            if(nums[i] == nums[i + 1]){
                count++;
            }
            else if(count > n){
                return nums[i];
            }
            else{
                count = 1;
            }
            i++;
        }
        return nums[i];
    }
}