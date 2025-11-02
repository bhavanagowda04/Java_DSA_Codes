package com.lecture11;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 6, 7, 8, 88, 23, 35,56, 56, 57,45);
        fun();
        fun(3, 5, "shjd", "sdjfui");
    }
    static void fun(int a, int b, String ...vsdd){

    }

    static void fun(int ...vsd){
        System.out.println(Arrays.toString(vsd));
    }
}
