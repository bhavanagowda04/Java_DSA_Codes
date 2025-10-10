package com.lecture10;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ID: ");
        int empID = sc.nextInt();
        System.out.print("Enter the departent: ");
        String department = sc.next();

        switch (empID){
            case 1:
                System.out.println("Bhavana Gowda");
                break;
            case 2:
                System.out.println("Prakzz");
                break;
            case 3:
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("no department");
                }
            default:
                System.out.println("no id");


        }


    }
}
