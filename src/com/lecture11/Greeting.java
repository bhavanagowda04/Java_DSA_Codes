package com.lecture11;

public class Greeting {
    public static void main(String[] args) {
//        greeting();
        String personalised = greeting("bhavana");
        System.out.println(personalised);

    }
    static String greeting(String name){
        String message = "Hello "+ name;
        return message;
    }
}
