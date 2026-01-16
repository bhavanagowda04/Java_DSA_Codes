package com.practice05;

import java.util.ArrayList;
import java.util.List;

class Solution {
    static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int[] more = new int[candies.length];
        int k = 0;
        int i = 0;
        while (i < candies.length) {
             more[k] = candies[i] + extraCandies;
             k++;
             i++;
        }
        while (k > more.length){
            if(more[k] < candies[i]){
                ans.add(false);
            }
            else{
                ans.add(true);
                i++;
            }
            k++;
        }
        return ans;
    }
}