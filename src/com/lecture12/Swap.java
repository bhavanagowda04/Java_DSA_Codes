package com.lecture12;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 56, 3, 45, 67};
//        swap(arr, 1, 2);

        reverse(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
            }
    }

//
//    static void swap(int[] arr, int index1, int index2){
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;
//    }
}
