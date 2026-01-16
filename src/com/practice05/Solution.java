package com.practice05;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

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
        for (int i = 0; i < candies.length; i++) {
            int more = candies[i] + extraCandies;
            boolean isGreatest = true;
            for (int j = 0; j < candies.length; j++) {
                if(more < candies[j]) {
                    isGreatest = false;
                    break;
                }
            }
            ans.add(isGreatest);
        }
        return ans;
    }
}