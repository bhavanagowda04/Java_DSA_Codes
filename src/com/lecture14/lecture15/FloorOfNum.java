package com.lecture14.lecture15;

public class FloorOfNum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 12, 13, 14, 16, 17, 20};
        int target = 15 ;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    //return the index of greatest number <= target
    static int floor(int[] arr,int target){
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
        return end;
    }
}


