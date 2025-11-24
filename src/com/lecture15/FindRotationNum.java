package com.lecture15;

public class FindRotationNum {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,2,3};
        System.out.println(findpivot(arr));

    }

    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid +1;
            }
            if (mid < end && arr[mid] < arr[mid - 1]) {
                return mid;
            }
            if (arr[start] >= arr[mid]) {
                return mid;
            }else{
                return mid + 2;
            }
        }
        return -1;
    }
}
