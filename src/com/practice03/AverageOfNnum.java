package com.practice03;

import java.util.Scanner;

public class AverageOfNnum {
    public static void main(String[] args) {
        System.out.println(avg());
    }

    static float avg(){
        float ans = 1;
        int sum = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the intergers: ");
        int n = 1234;
        int count = 0;
        while(n > 0){
            int a = n % 10;
            sum = sum + a;
            n = n/10;
            count++;

        }
        ans = (float) sum/(float)count;
        return ans;
    }
}
