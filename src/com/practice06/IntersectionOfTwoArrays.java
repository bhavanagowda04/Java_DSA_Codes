package com.practice06;
//https://leetcode.com/problems/intersection-of-two-arrays/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IntersectionOfTwoArrays {
    static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] uniq1 = uni(nums1);
        int[] uniq2 = uni(nums2);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < uniq1.length; i++) {
            for (int j = 0; j < uniq2.length; j++) {
                if(uniq1[i] == uniq2[j]){
                    list.add(uniq1[i]);
                }
                
            }
            
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    static int[] uni(int[] nums1){
        int k = 1;
        for (int i = 1; i < nums1.length; i++) {
            if (nums1[i] != nums1[i - 1]) {
                k++;
            }
        }

        int[] uniq = new int[k];
        uniq[0] = nums1[0];
        int idx = 1;
        for (int i = 1; i < nums1.length; i++) {
            if(nums1[i] != nums1[i-1]){
                uniq[idx] = nums1[i];
                idx++;
            }
        }
        return uniq;
    }

    static int[] uni2(int[] nums2){
        int k = 1;
        for (int i = 1; i < nums2.length; i++) {
            if (nums2[i] != nums2[i - 1]) {
                k++;
            }
        }

        int[] uniq = new int[k];
        uniq[0] = nums2[0];
        int idx = 1;
        for (int i = 1; i < nums2.length; i++) {
            if(nums2[i] != nums2[i-1]){
                uniq[idx] = nums2[i];
                idx++;
            }
        }
        return uniq;
    }
    


}