package com.practice08;
//https://leetcode.com/problems/length-of-last-word/description/


class Solution {
    static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
    static int lengthOfLastWord(String s) {
        CharSequence a = " ";
        if(!s.contains(a)){
            return s.length();
        }
        int count = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' '){
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            char ch = s.charAt(i);
            if(ch != ' '){
                count++;
                i--;
            }else{
                break;
            }
        }
        return count;
    }
}