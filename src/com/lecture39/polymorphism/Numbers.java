package com.lecture39.polymorphism;

public class Numbers {

    int sum (int a,int b){
        return a;
    }

    int sum (int a, int b, int c){
        return a ;
    }

    static void main(String[] args) {
        Numbers obj = new Numbers();
          obj.sum(2,3);
          obj.sum(1,2,3);
    }
}
