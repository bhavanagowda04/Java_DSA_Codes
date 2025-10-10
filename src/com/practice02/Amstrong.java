package com.practice02;



public class Amstrong {
    public static int main(String[] args) {
        int a = 153;
        int d = 0;
        int b = a;
        int sum = 0;


        while (a >= 0) {
            a = a / 10;
            d++;
        }
        System.out.println("the digit: " + d);
        return d;
    }
}


//
//
//        while( b >= 0){
//            int temp = b % 10;
//            int power = d ;
//            int ans = 0;
//                for(int i = 0; i < d; i++ ){
//                    ans *= temp;
//                }
//            b = b/10;
//        }
//
//        System.out.println("amstrong: " + sum );
//
//        return a;

