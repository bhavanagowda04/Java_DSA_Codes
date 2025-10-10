package com.lecture09;

public class IfStatement {
    public static void main(String[] args){
        int salary = 9000;
//        if(salary > 10000){
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;
//        }
//
        //multiple if-else statments

        if(salary > 10000 && salary < 20000){
            salary = 2000;
        } else if (salary > 20000 ){
            salary = 3000;
        } else {
            salary = 1000;
        }

        System.out.println(salary);
    }

}
