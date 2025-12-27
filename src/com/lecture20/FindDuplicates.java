package com.lecture20;
//https://leetcode.com/problems/find-the-duplicate-number/description/
import java.util.Arrays;

class FindDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while(i< nums.length) {
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else{
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return nums[index];
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
