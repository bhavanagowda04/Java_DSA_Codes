// File name: Polymorphism.java

class Student_poly {
    String name;
    int age;
    String rollNo;

    public void printInfo(String name) {
        System.out.println("Name: " + name);
    }

    public void printInfo(int age) {
        System.out.println("Age: " + age);
    }

    public void printInfo(String name, int age) {
        System.out.println("Name is " + name + " and age is " + age);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Student_poly s1 = new Student_poly();
        s1.name = "Bhavana";
        s1.age = 20;

        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);
    }
}
