package com.lecture23;

public class Main {
    public static void main(String[] args) {
        //write a funtion that prints helloworld
        message();
        print();

    }

    static void message(){
        System.out.println("Hello world");
    }

    static void print(){
//        if (n == 5){
//            return;
//        }
        for(int n = 1; n <= 5; n++) {
            System.out.println(n);
        }
    }
}
