abstract class Animal { // abstract is juzt concept it cannot be instantiated or run any method
    abstract void walk();
    Animal() {
        System.out.println("You are creating an animal");
    }
  
}

class Horse extends Animal {
    Horse() {
        System.out.println("created a horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}

public class Abstract {
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();
       // horse.eats();

    }
}