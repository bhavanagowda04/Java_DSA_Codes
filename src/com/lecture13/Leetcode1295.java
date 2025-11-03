package com.lecture13;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/?envType=problem-list-v2&envId=array

public class Leetcode1295 {
    public static void main(String[] args) {
        //QUESTION: Given an array nums of integers,return how many of them contain an even number of digits.
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
        System.out.println(digits(7896));
    }

    static int findNumbers(int[] num){
        int count = 0;
        for(int i =  0; i < num.length; i++ ){
            if (even(num[i])){
                count ++;
            }
        }
        return count;
    }

    //function to check it contains even number or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }

    //count number of digits
    static int digits(int num) {

        //for negative numbers
        if(num<0){
            num = num * -1;

        }


        int count= 0;
        while(num >0){
            count++;
            num = num/10;
        }
        return count;
    }
}
