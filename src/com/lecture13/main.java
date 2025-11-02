package com.lecture13;

public class main {
    public static void main(String[] args) {

        int[] nums = {23, 45, 67, 345, 56, 2, 3, 56, 67};
        int target = 100;
        boolean ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    //search the target and return true or false
    static boolean linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return true;
            }
        }
        return false;
    }

//    //search the target and return the element
//    static int linearSearch(int[] arr, int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//
//        //run a for loop
//        for (int index = 0; index < arr.length; index++) {
//            int element = arr[index];
//            if (element == target) {
//                return element;
//            }
//        }
//        return Integer.MAX_VALUE;
//    }

    //search in the array and return the index if found
//    static int linearSearch(int[] arr, int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//
//        //run a for loop
//        for (int index = 0; index < arr.length; index++) {
//            int element = arr[index];
//            if (element == target) {
//                return index;
//            }
//        }
//        return -1;
//    }
}


