package com.lecture13;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 24, 34, 46, 67, 34};
        int target = 34;
        System.out.println(linearSearch(arr, target, 1, 6));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop
        for (int index = start; index < end; index++) {
            int element = arr[index];
            if (element == target) {
                return element;
            }
        }
        return -1;
    }

    }
