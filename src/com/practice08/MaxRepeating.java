package com.practice08;
//https://leetcode.com/problems/maximum-repeating-substring/

class MaxRepeating {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String current = word;

        while (sequence.contains(current)) {
            count++;
            current += word;
        }
        return count;
    }
}