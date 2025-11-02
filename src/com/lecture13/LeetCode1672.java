package com.lecture13;

public class LeetCode1672 {
    public static void main(String[] args) {

    }
    public int MaximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person++){
            int rowsum = 0;
            for(int account = 0; account < accounts[person].length; account++){
               rowsum += accounts[person][account];
               }

            //check with overa;ll anas
            if (rowsum > ans){
                ans  = rowsum;
            }
        }
        return ans;
    }
}
