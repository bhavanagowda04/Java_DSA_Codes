package com.practice04;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        System.out.println(Arrays.toString(flipAndInvertImage(image)));
    }

    static int[][] flipAndInvertImage(int[][] image) {
//        int r = image.length;
//        int c = image[0].length;
        int[][] arr = new int[image.length][image[0].length];
        for(int r = 0; r < image.length; r++){
//            for(int c = 0; c < image[0].length; c--){
                while(r != image.length-1){
                    int[] c = {image[0].length % 10};
                    return new int[][]{};
                }
            }
//        }
        return new int[][] {};
    }
}