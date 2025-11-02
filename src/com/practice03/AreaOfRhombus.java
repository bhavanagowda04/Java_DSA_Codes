package com.practice03;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        int ans = area();
        System.out.println("The area of rhombus is : " +  ans);
    }

    static int area(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diagonal1: ");
        int d1 = sc.nextInt();
        System.out.print("Enter the diagonal2: ");
        int d2 = sc.nextInt();
        int area = (int)(0.5 * d1 * d2);
        return area;
    }
}
