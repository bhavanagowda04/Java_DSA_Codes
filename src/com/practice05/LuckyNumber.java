package com.practice05;
//https://leetcode.com/problems/lucky-numbers-in-a-matrix/

import java.util.ArrayList;
import java.util.List;

class LuckyNumber {
    static void main(String[] args) {
        int[][] matrix = {{3, 7, 8},
                {9,11,13},
                {15,16,17}
        };
        System.out.println(luckyNumbers(matrix));
    }
    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int r = matrix.length;
        for (int i = 0; i < r; i++) {
            int min = smallestIndex(matrix[i]);
            int max = matrix[i][min];
            boolean isMax = true;
            for (int j = 0; j < r; j++) {
                if (matrix[j][min] > max) {
                    isMax = false;
                    break;
                }
            }
            if(isMax){
                ans.add(max);
            }
        }
        return ans;
    }

    static int smallestIndex(int[] row) {
        int min = row[0];
        int index = 0;
        int j;
        for (j = 1; j < row.length; j++) {
            if (row[j] < min) {
                min = row[j];
                index = j;
            }
        }
        return index;
    }
}