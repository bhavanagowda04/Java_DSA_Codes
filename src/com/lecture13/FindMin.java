package com.lecture13;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 24, 3, 46, 67, 34};
        System.out.println(min(arr));
    }

    //assume arr.length :=  0
    static int min (int[] arr){
        int ans = arr[0];
        for(int i =  1; i < arr.length; i++){
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
