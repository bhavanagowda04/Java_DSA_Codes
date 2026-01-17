package com.lecture39;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

    public Box(double l, double h, double w) {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    public void information(){
        System.out.println("running the box");
    }

}
