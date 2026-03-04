package com.Leetcodes;
//https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/?envType=problem-list-v2&envId=array


class IsPrefixString {
    public boolean isPrefixString(String s, String[] words) {
        int i = 0; // pointer for s
        
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (i == s.length() || s.charAt(i) != c) {
                    return false;
                }
                i++;
            }
            
            if (i == s.length()) {
                return true;
            }
        }
        
        return false;
    }
}