package com.lecture11;

public class Overloading {
    public static void main(String[] args) {
        fun("sdjhjf");
        fun("jsdj", 23);
    }

    static void fun(String name){
        System.out.println(name);

    }

    static void fun( String name, int a){
        System.out.println(name);
    }
}
