package com.lecture10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fruit name: ");
        String fruit = sc.next();

//        if(fruit.equals("mango")){
//            System.out.println("King of Fruits");
//        }
//        if(fruit.equals("apple")){
//            System.out.println("a sweet red fruit");
//        }
//        switch (fruit) {
//            case "Mango" -> System.out.println("king of fruits");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Small fruits");
//            default -> System.out.println("please enter a valid fruit");
//        }
        int day = sc.nextInt();
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekdays");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekends");
//                break;
//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekends");
        }
    }
}
