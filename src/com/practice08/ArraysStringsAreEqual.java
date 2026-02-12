package com.practice08;
//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/


class ArraysStringsAreEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for(String w : word1){
            s1.append(w);
        }

        for(String w : word2){
            s2.append(w);
        }

        return s1.toString().equals(s2.toString());
    }
}