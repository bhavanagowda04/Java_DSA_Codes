package com.practice05;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
import java.util.Arrays;

public class TwoSum2 {
    static void main(String[] args) {
        int[] numbers = {2,3,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    static int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++ ){
            for(int j = i + 1; j < numbers.length; j++ ){
                if(numbers[i] + numbers[j] == target ){
                    return new int[] {i , j};
                }
            }

        }
        return new int[] { -1, -1};
    }
}
