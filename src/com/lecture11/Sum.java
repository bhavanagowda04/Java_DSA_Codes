package com.lecture11;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(20 , 30);
        System.out.println(ans);
    }

    // pass the value of number when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }


    //return the value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First num: ");
        int a = sc.nextInt();
        System.out.print("Enter second num: ");
        int b = sc.nextInt();
        int sum = a + b;
        return sum;
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First num: ");
        int a = sc.nextInt();
        System.out.print("Enter second num: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
