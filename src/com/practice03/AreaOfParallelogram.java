package com.practice03;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        int ans = area();
        System.out.println("Area of Parallelogram is: " + ans);
    }

    static int area(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int b = sc.nextInt();
        System.out.print("Enter the height: ");
        int h = sc.nextInt();
        int area = b * h;
        return area;
    }
}
