package com.lecture42.comparing;

public class Main {
    static void main(String[] args) {
        Student bhavana = new Student(14,89.57f);
        Student Prak = new Student(52,95.42f);

        if(bhavana.compareTo(Prak) < 0){
            System.out.println("Prak has more marks");
        }
    }
}
