package com.lecture37;

public class WrapperExamples {
    static void main(String[] args) {
        int a = 10;

        Integer num = 45;
        final A bhavana = new A("Bhavana");
        bhavana.name = "othe name";

        A obj;

        for (int i = 0; i < 1000000; i++) {
            obj = new A("random name");

        }
    }

}

class A{
    final int num = 10;
    String name;

    public A(String name){
        this.name= name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}
