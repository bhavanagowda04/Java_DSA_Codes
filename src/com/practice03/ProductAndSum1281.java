package com.practice03;
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/

public class ProductAndSum1281 {
    public static void main(String[] args) {
        int n = 234;

        System.out.println(subtractProductAndSum(n));
    }
    static int subtractProductAndSum(int n){
        int sum = 0;
        int product = 1;
        while(n > 0){
            int temp = n % 10;
            sum = sum + temp;
            product = product * temp;
            n = n / 10;
        }
        return product - sum;

    }
}
