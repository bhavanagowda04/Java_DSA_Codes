package com.practice08;
//https://leetcode.com/problems/reverse-words-in-a-string-iii/

class ReverseWordSentence {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            StringBuilder temp = new StringBuilder(words[i]);
            result.append(temp.reverse());
            
            if (i != words.length - 1) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}