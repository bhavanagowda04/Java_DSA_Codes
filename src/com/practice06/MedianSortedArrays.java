package com.practice06;
//https://leetcode.com/problems/median-of-two-sorted-arrays/description/


class MedianSortedArrays {
    static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mix = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                mix[k] = nums1[i];
                i++;
            } else{
                mix[k] =nums2[j];
                j++;
            }
            k++;
        }

        while(i < nums1.length){
            mix[k] = nums1[i];
            i++;
            k++;

        }
        while(j < nums2.length){
            mix[k] = nums2[j];
            j++;
            k++;
        }

        double ans = 0;
        int start = 0;
        int end = mix.length -1;
        if(mix.length % 2 != 0){
            ans = (start + (double) (end - start) / 2);
            return mix[(int) ans];
        }
        if(mix.length % 2 == 0){
            int mid = (mix.length) / 2;
            ans = (double) (mix[mid] + mix[mid - 1]) / 2;
            return ans;

        }
        return ans;
    }
}