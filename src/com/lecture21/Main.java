package com.lecture21;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        String name = "bhavana m";
        String a = "bhavana m";
        System.out.println(name == a );//this will give true and creates stringpool

        String name1 = new String("dora");
        String name2 = new String("dora");
        System.out.println(name1 == name2); //this will give false
        System.out.println(name1.equals(name2));

        System.out.println(name1.charAt(1));//it gives the letter in that index
    }
}
