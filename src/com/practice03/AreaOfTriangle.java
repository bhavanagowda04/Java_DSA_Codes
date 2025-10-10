package com.practice03;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        double ans = area();
        System.out.println("Area of the Triangle: " + ans);

    }
    static double area(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Breath: ");
        double b  = sc.nextDouble();
        System.out.print("Enter the length: ");
        double l = sc.nextDouble();
        double area = 0.5 * b * l;
        return area;
    }
}
