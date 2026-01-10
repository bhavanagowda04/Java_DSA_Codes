package com.practice06;
//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/

public class CountNegativeInMatrix {
    public static void main(String[] args) {
        int[][] grid = {
                {-5,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        System.out.println(countNegatives(grid));
    }

    static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] < 0 ){
                    count++;
                }
            }

        }

        return count;
    }
}
