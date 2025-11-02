package com.lecture11;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "bhavana";
        {
            // int a = 70;  this cannot be done in same function
            a =78;
            System.out.println(a);
            int c = 99;
            name = "dora";
            System.out.println(name);
            // valuse initialised in this block, will remain in block
        }
        System.out.println(a);
        //System.out.println(c); //cannot use outside the block

        //scoping in for loops
        for (int i = 0; i < 4; i++){
            System.out.println(i);
            int num = 90;
            a = 10000;
        }
        System.out.println(a);
    }


    static void random(int marks){
        int num = 50;
        System.out.println(num);
    }
}
