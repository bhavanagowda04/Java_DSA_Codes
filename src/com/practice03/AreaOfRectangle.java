package com.practice03;

import java.util.Scanner;

public class AreaOfRectangle {
        public static void main(String[] args) {
            double ans = area();
            System.out.println("Area of the Rectangle: " + ans);

        }
        static double area(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the width: ");
            double w  = sc.nextDouble();
            System.out.print("Enter the length: ");
            double l = sc.nextDouble();
            double area = w * l;
            return area;
        }
    }

