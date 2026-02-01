package com.Leetcodes;
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

class FirstOccurrence {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }else{
            return -1;
        }
    }
}