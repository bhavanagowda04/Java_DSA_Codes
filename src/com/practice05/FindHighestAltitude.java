package com.practice05;
//https://leetcode.com/problems/find-the-highest-altitude/description/

class FindHighestAltitude {
    static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    static int largestAltitude(int[] gain) {
        int[] fresh = new int[gain.length + 1];
        int k = 1;
        fresh[0] = 0;
        while(k < gain.length + 1) {
            for (int i = 0; i < gain.length; i++) {
                fresh[k] = fresh[k - 1] + gain[i];
                k++;
            }
        }
        int maxVal = fresh[0];
        int i;
        for (i = 0; i < fresh.length; i++) {
            if(fresh[i] > maxVal){
                maxVal=fresh[i];
            }
        }
        return maxVal;
    }
}