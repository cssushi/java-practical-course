interface Flyable {

    // Declare the method that flying objects must provide
    void fly();
}

interface Swimmable {

    // Declare the method that swimming objects must provide
    void swim();
}

class Duck implements Flyable, Swimmable {

    // Implement both required methods
    public void fly() {
        System.out.println("Duck is flying");
    }

    public void swim() {
        System.out.println("Duck is swimming");
    }
}

public class Interfaces {
    public static void main(String[] args) {

        Duck duck = new Duck();

        // Demonstrate both abilities
        duck.fly();
        duck.swim();
    }
}