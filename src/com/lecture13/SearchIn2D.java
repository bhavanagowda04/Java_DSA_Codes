package com.lecture13;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 3, 56},
                {45, 23, 5, 7, 3},
                {67, 34, 12, 67},
                {37, 89}
        };
        int target = 7;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target){
        for(int row = 0; row< arr.length; row++){
            for (int col = 0; col< arr[row].length; col++){
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row< arr.length; row++){
            for (int col = 0; col< arr[row].length; col++){
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
