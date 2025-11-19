package com.lecture15;

public class InfinitArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 8, 9, 10, 12,
                14, 15, 17, 19, 34, 56, 78, 90, 123};
        int target = 19;
        System.out.println(infinitAns(arr, target));



    }

    static int infinitAns(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid -1;
            } else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }

        }
        return -1;
    }
}
