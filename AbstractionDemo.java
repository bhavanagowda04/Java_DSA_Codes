abstract class AnimalAbstract { // abstract class Animal { // abstract is juzt concept it cannot be instantiated or run any method
    abstract void walk();
    AnimalAbstract() { // Animal() {
        System.out.println("You are creating an animal");
    }
}

class HorseAbstract extends AnimalAbstract { // class Horse extends Animal {
    HorseAbstract() { // Horse() {
        System.out.println("created a horse");
    }
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

class ChickenAbstract extends AnimalAbstract { // class Chicken extends Animal {
    public void walk() {
        System.out.println("walks on 2 legs");
    }
}

public class AbstractionDemo { // public class AbstractClassDemo {
    public static void main(String args[]) {
        HorseAbstract horse = new HorseAbstract(); // Horse horse = new Horse();
        horse.walk();
        // horse.eats();
    }
}
