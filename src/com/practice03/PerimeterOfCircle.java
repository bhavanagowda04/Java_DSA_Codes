package com.practice03;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        double perimeter = ans();
        System.out.println("The perimeter of circle is: " + perimeter);
    }

    static double ans(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius r: ");
        double r = sc.nextDouble();
        double p = 2 * 3.14 * r;
        return p;

    }
}
