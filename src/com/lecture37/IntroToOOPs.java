package com.lecture37;

import java.util.Arrays;

public class IntroToOOPs {
    public static void main(String[] args) {
//        Student[] students = new Student[5];
        Student bhavana = new Student();
        Student prak = new Student();
//        bhavana.rno = 14;
//        bhavana.name = "bhavana m";
//        bhavana.marks = 90.9f;

//        System.out.println(bhavana.rno);
//        System.out.println(bhavana.name);
//        System.out.println(bhavana.marks);

        bhavana.greeting();
        prak.greeting();

    }
}

class Student{
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello my name is " + this.name);
    }
    //contrustor
    Student() {
        this.rno =14;
        this.name = "bhavana";
        this.marks = 80.5f;
    }
}
