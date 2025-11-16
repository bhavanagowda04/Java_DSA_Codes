package com.lecture14.lecture15;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1831373682/

public class LetterCeilingLeetCode744 {
    public static void main(String[] args) {
        char[] letters = {'c', 'd', 'f', 'j'};
        char target = 'f';
        char ans = ceiling(letters, target);
        System.out.println(ans);
    }

    //return the index of smallest element >= target
    static char ceiling(char[] letters,char target){
        int start = 0;
        int end = letters.length -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < letters[mid]){
                end = mid -1;
            } else {
                start = mid + 1;
            }

        }
        return letters[start % letters.length];
    }
}
