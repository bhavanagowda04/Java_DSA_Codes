interface Animal {
    int eyes = 2; // by default public static final
    void walk();
}

class Horse implements Animal{ 
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

public class Abstract_Interface {
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();
    }
}