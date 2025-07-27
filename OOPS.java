class Pen {
    String color;
    String type;
    public void write() {
        System.out.println("writing something");
    }

    public void printcolor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;
    String rollNo;

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Roll No: " + this.rollNo);
    }

    // Student(String name, int age, String rollNo) {
    //     this.name = name;
    //     this.age = age;
    //     this.rollNo = rollNo;
    //     System.out.println("constructor called");
    // }

    //copy constructor
    // Student(Student s2) {
    //     this.name = s2.name;
    //     this.age = s2.age;
    //     this.rollNo = s2.rollNo;
    // }
}

public class OOPS{
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.color = "red";
        p1.type = "gel";

        Pen p2 = new Pen();
        p2.color = "blue";
        p2.type = "ball";

        p1.write();
        p2.printcolor();

        //Student s1 = new Student("Bhavana", 20, "BA123");
        //s1.printInfo();

        // Using the copy constructor
        // Student s2 = new Student(s1);
        // s2.printInfo();
        Student s1 = new Student();
        s1.name = "Bhavana";
        s1.age = 20;
        s1.rollNo = "BA123";
        s1.printInfo(); 
    }

}