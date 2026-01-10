package com.practice05;
//https://leetcode.com/problems/rotate-array/description/

import java.util.Arrays;

class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1) return;
        k = k % n;
        if (k == 0) return;

        // reverse whole array
        reverse(nums, 0, n - 1);
        // reverse first k elements
        reverse(nums, 0, k - 1);
        // reverse remaining n-k elements
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] a, int i, int j) {
        while (i < j) {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            i++; j--;
        }
    }

    // test helper
    public static void main(String[] args) {
        RotateArray s = new RotateArray();
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        s.rotate(nums, 5);
        System.out.println(Arrays.toString(nums)); // [5,6,7,1,2,3,4]
    }
}