package com.practice9;

public class NumberPattern {
    static void main() {
        pattern1(5);
        pattern30(5);
        pattern17(4);
        pattern31(4);
    }

    static void pattern1(int n){
        for(int row = 1; row <= n; row++){
            for( int col=1; col <= row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for(int row = 1; row <= n; row++ ){
            for(int s = 0; s < n - row; s++ ){
                System.out.print(" ");
            }
            for( int col=row; col >= 1; col--){
                System.out.print(col);
            }
            for(int col = 2; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
        for(int row = 1; row <= 2 * n; row++ ){

            int c =  row > n ? 2 * n - row: row;

            for(int s = 0; s < n - c; s++ ){
                System.out.print(" ");
            }
            for( int col=c; col >= 1; col--){
                System.out.print(col + " ");
            }
            for(int col = 2; col <= c; col++){
                System.out.print(col+ " " );
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
        int originalN = n;
        n = 2 * n;
        for(int row = 0; row <= n ; row++ ){
            for(int col = 0; col <= n; col++){
                int atEveryIndex =originalN - Math.min(Math.min(row, col),Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
