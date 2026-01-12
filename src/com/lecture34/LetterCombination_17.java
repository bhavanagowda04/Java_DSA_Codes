package com.lecture34;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/


import java.util.ArrayList;
import java.util.List;

public class LetterCombination_17 {
    static void main(String[] args) {
        pad("", "12");
        System.out.println(pad1("", "12"));
    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';   //this will convert '2' to 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);

            pad(p + ch, up.substring(1));
        }

    }


    static ArrayList<String> pad1(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';   //this will convert '2' to 2
        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(pad1(p + ch, up.substring(1)));
        }
        return list;
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) {
            return result;
        }

        helper("", digits, result);
        return result;
    }

    static void helper(String p, String up, List<String> result) {
        if (up.isEmpty()) {
            result.add(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        String[] map = {
                "",     // 0
                "",     // 1
                "abc",  // 2
                "def",  // 3
                "ghi",  // 4
                "jkl",  // 5
                "mno",  // 6
                "pqrs", // 7
                "tuv",  // 8
                "wxyz"  // 9
        };

        String letters = map[digit];

        for (int i = 0; i < letters.length(); i++) {
            helper(p + letters.charAt(i), up.substring(1), result);
        }
    }
}
