class Shape {
    public void area(){
        System.out.println("Area of Shape");
    }
}

class Triangle extends Shape{
     public void area(int l, int h) {
        System.out.println("Area of Triangle: " + (0.5 * l * h));
     }

}

public class Inheritance {
    public static void main(String args[]) {
        Triangle t = new Triangle();
        int l = 5, h = 10;
        t.area(5,10);

    }
    }
