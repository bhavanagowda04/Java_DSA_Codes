package com.Leetcodes;
//https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/?envType=problem-list-v2&envId=array


class FindSpecialInteger {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int quarter = n / 4;

        for (int i = 0; i < n - quarter; i++) {
            if (arr[i] == arr[i + quarter]) {
                return arr[i];
            }
        }

        return -1;
    }
}