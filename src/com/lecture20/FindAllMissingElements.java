package com.lecture20;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.List;

class FindAllMissingElements {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i< nums.length) {
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else{
                i++;
            }
        }
        //just find missing number 
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}