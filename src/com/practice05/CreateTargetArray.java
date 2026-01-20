package com.practice05;
//https://leetcode.com/problems/create-target-array-in-the-given-order/description/


import java.util.ArrayList;
import java.util.Arrays;

class CreateTargetArray {
    static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]); // INSERT happens here
        }

        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

}