package com.practice08;
//https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/

class CheckOnesSegment {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}