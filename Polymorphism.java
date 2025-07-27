class Student_poly {
    String name;
    int age;
    String rollNo;

    public void printInfo(String name) {
        System.out.println("Name: " + this.name);
    }
    public void printInfo(int age) {
        System.out.println("Age: " + this.age);
    }
    public void printInfo(String name, int age) {
        System.out.println("Name is" + this.name + " and age is " + this.age);
    }

   
}

public class Polymorphism{
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Bhavana";
        s1.age = 20;
        s1.printInfo(s1.age); 
    }

}
