package com.lecture14;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {99, 78, 67, 56, 34, 23, 22, 12, 11, 9, 7, 6, 4};
        int target = 78 ;
        int ans = agnosticBS(arr, target);
        System.out.println(ans);
    }

    static int agnosticBS(int[] arr,int target){
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
        return -1;
    }
}
