package com.practice03;

import java.util.Scanner;

public class ArearOfEquilateralTriangle {
    public static void main(String[] args) {
        double area = area();
        System.out.println("The area of equilateral triangle is : " + area);
    }

    static double area(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of one side 'a' : ");
        double a = sc.nextDouble();
        double ans = (1.732/4) * a * a;
        return ans;
    }
}
