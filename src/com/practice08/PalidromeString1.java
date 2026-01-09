package com.practice08;

class PalidromeString1 {
    static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s) {
        if(s.length() == 0 ){
            return true;
        }
        s = s.toLowerCase();
        for(int i = 0; i <= s.length()/2; i++){
            char start = s.charAt(i);
            char end = s.charAt(s.length() -1 -i);
            if(start != end) {
                return false;
            }

        }
        return true;
    }
}