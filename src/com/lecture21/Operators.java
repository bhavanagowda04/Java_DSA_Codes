package com.lecture21;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //converts into Ascii value (char)
        System.out.println("a" + "b"); //String so it becomes ab
        System.out.println('a' + 3); //ascii value
        System.out.println((char)('a' + 3)); // it adds the char a+b+c soo at last will be d

        System.out.println("a" + 1); //string wont convert into  ascii

        System.out.println("bhavana" + new ArrayList<>());
    }
}
