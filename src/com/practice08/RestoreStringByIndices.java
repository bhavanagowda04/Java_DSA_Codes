package com.practice08;
//https://leetcode.com/problems/shuffle-string/description/

class RestoreStringByIndices {
    static void main(String[] args) {
        int[] indices = {4,5,6,7,0,2,1,3};
        String s = "codeleet";
        System.out.println(restoreString(s,indices));
    }
    static String restoreString(String s, int[] indices) {
        StringBuilder ans = new StringBuilder();
        int k = 0;
        while(k < indices.length) {
            for (int i = 0; i < indices.length; i++) {
                if (indices[i] == k) {
                    ans.append(s.charAt(i));
                    k++;
                }
            }
        }
        return ans.toString();
    }
}