package com.practice04;
//https://leetcode.com/problems/number-of-good-pairs/description/

public class NumOfGoodPairs{
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums));
    }

    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        int i = 0;
            while(i != nums.length ) {
                for(i = 0; i <= nums.length-1; i++) {
                    for (int j = i + 1; j <= nums.length - 1; j++) {
                        if (nums[i] == nums[j]) {
                            count++;
                        }
                    }
                }
            }
        return count;
    }
}