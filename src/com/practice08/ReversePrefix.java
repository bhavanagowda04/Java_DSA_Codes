package com.practice08;
//https://leetcode.com/problems/merge-strings-alternately/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ReversePrefix {
    static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqrxy";
        System.out.println(mergeAlternately(word1,word2));
    }

    static String mergeAlternately(String word1, String word2) {
        StringBuilder mix = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < word1.length()){
            while(j < word2.length()) {
                mix.append(word1.charAt(i));
                i++;
                mix.append(word2.charAt(j));
                j++;
            }
        }
        return mix.toString();
    }
}