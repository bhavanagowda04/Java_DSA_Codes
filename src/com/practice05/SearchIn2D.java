package com.practice05;
//https://leetcode.com/problems/search-a-2d-matrix/

import java.util.Arrays;

class SearchIn2D {
    static void main(String[] args) {
        int[][] matrix = {
                {1}
        };
        System.out.println(searchMatrix(matrix, 3));

    }
    static boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[r].length - 1;
        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return true ;
            }
            if(matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return false;
    }
}