package com.lecture09;

import java.util.Scanner;


public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("The entered char is Lower case");
        } else {
            System.out.println("The entered char is Upper case");
        }
        System.out.println(ch);
    }
}
