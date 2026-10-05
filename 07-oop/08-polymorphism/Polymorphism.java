class Animal {

    void sound() {
        // Print: Animal makes a sound.
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        // Print: Dog says Woof!
        System.out.println("Dog says Woof!");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        // Print: Cat says Meow!
        System.out.println("Cat says Meow!");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Call sound() on both references
        animal1.sound();
        animal2.sound();
    }
}