package com.lecture11;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//       word();
//       System.out.println(word());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.next();
        String personalised = myGreet("bhavana");
        System.out.println(personalised);
    }
    static String myGreet(String name) {
        String message = "Hello" + name;
        return message;
    }
//    static String word(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the greeting: ");
//        String greeting = sc.next();
//        return greeting;
    }

