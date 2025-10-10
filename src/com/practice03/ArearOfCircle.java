package com.practice03;

import java.util.Scanner;

public class ArearOfCircle {
    public static void main(String[] args) {
        double ans = area();
        System.out.println("Area of the circle: " + ans);
    }

    static double area(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius r: ");
        double r = sc.nextDouble();
        double pi = 3.14;
        double area = pi * r * r;
        return area;

    }
}
