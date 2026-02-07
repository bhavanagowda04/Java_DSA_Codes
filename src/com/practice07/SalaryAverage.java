package com.practice07;
//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/

import java.util.Arrays;

class SalaryAverage {
    static void main(String[] args) {
        int[] salary = {4000,2000,3000,1000};
        System.out.println(average(salary));
    }
    static double average(int[] salary) {
        Arrays.sort(salary);
        double ans = 0;
        int count = 0;
        for (int i = 1; i <= salary.length-2; i++) {
            ans = ans + salary[i];
            count++;
        }
        ans = ans / count;
        return ans;
    }
}