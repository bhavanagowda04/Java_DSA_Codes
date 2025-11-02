package com.lecture12;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //syntax

        Scanner in =  new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(35);
//        list.add(45);
//        list.add(56);
//        list.add(23);
//        list.add(365);
//        list.add(87435);
//        list.add(8475);
//
//        list.contains(87435);
//        list.set(0,184);
//        list.remove(3);
//        System.out.println(list.contains(56));
//        System.out.println(list);

        for(int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++ ){
            System.out.print(list.get(i));
        }
        System.out.println(list);
    }
}
