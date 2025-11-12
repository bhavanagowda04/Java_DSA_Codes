package com.practice03;

import java.util.Scanner;

public class SumOfUserInputs {
    public static void main(String[] args) {
        System.out.println(sum());
    }

    static int sum(){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the intergers: ");
        while(true){
            int num = sc.nextInt();
            sum = sum + num;
            if(num == 0 ){
                return sum;
            }
        }

    }
}
