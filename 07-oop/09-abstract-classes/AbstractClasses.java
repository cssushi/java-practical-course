abstract class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    // Make this method abstract
    // You decide the exact syntax.
    abstract void sound();

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {

    Dog(String name) {
        // Call the parent constructor
        super(name);
    }

    // Implement the required abstract method here
    void sound() {
        System.out.println(name + " says Woof!");
    }
}

class Cat extends Animal {

    Cat(String name) {
        // Call the parent constructor
        super(name);
    }

    // Implement the required abstract method here
    void sound() {
        System.out.println(name + " says Meow!");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {

        // Create Dog and Cat objects using Animal references
        Animal dog = new Dog("Neo");
        Animal cat = new Cat("Luna");


        // Call sound() and eat() for both
        dog.sound();
        dog.eat();
        cat.sound();
        cat.eat();
    }
}