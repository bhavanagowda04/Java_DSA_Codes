package com.practice06;
//https://leetcode.com/problems/check-if-n-and-its-double-exist/description/

public class NAndItsDouble {
    static void main(String[] args) {
        int[] arr = {-20,8,-6,4};
        System.out.println(checkIfExist(arr));
    }
    static boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int j = 0;
                while (j < arr.length) {
                    if (i!= j && arr[i] == 2 * arr[j]) {
                        return true;
                    }
                    j++;
                }
        }
        return false;
    }
}
