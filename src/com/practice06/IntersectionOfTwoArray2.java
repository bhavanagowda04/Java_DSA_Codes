package com.practice06;
//https://leetcode.com/problems/intersection-of-two-arrays-ii/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IntersectionOfTwoArray2 {
    static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);


        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]) {
                i++;
            }
            else {
                j++;
            }
        }


        int[] ans = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            ans[k] = list.get(k);
        }
        return ans;

    }
}