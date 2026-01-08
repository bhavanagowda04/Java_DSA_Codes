package com.lecture26;

public class PrimeNum {
    static void main(String[] args) {
        int num = 20;
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        int i = 2;
        while( i * i <= num){
            if(num % i == 0 ){
                return false;
            }
            i++;
        }
        return true;
    }
}
