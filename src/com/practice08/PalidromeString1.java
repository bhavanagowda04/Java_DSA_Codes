package com.practice08;
//https://leetcode.com/problems/valid-palindrome/description/

class PalidromeString1 {
    static void main(String[] args) {
        String s = " ";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                cleaned.append(ch);
            }
        }

        String n = cleaned.toString();

        if(n.length() == 0 ){
            return true;
        }
        n = n.toLowerCase();

        for(int i = 0; i <= n.length()/2; i++){
            char start = n.charAt(i);
            char end = n.charAt(n.length() -1 -i);
            if(start != end) {
                return false;
            }

        }
        return true;
    }
}