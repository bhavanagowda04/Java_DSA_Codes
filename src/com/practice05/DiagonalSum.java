package com.practice05;
//https://leetcode.com/problems/matrix-diagonal-sum/description/

class DiagonalSum {
    static void main(String[] args) {
        int[][] mat = {{1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(diagonalSum(mat));
    }
    static int diagonalSum(int[][] mat) {
        int ans = 0;
        int i = 0;
        int j = 0;
        while (i <= mat.length - 1) {
            ans = ans + mat[i][j];
            i++;
            j++;
        }
        int r = 0;
        int c = j - 1;
        while (r <= mat.length - 1) {
            ans = ans + mat[r][c];
            r++;
            c--;
        }

        if (mat.length % 2 == 1) {
            ans = ans - mat[mat.length / 2][mat.length / 2];
        }

        return ans;
    }
}