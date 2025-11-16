package com.lecture14.lecture15;

public class CeilingOfNum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18, 20};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    //return the index of smallest element >= target
    static int ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        //find wheather the array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else if(target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return start;
    }
}

