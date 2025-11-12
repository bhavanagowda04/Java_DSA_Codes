package com.practice03;

import java.util.Scanner;

public class LargestOfUserInput {
    public static void main(String[] args) {
        System.out.println(largest());
    }

    static int largest(){
        Scanner sc = new Scanner(System.in);
        int big = -1;
        while (true){
            System.out.print("Enter the num:");
            int num = sc.nextInt();
            if(big < num){
                big = num;
            }
            if(num == 0 ) {
                return big;
            }
        }
    }
}
