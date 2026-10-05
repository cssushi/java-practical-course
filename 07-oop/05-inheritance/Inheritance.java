class Animal {
    // String name
    // int age

    String name;
    int age;


    // Create a method called eat()
    // Print: "[name] is eating."
    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {

    // Create a method called bark()
    // Print: "[name] says Woof!"
    void bark() {
        System.out.println(name + " says Woof!");
    }
}

class Cat extends Animal {

    // Create a method called meow()
    // Print: "[name] says Meow!"
    void meow() {
        System.out.println(name + " says Meow!");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        // Create a Dog object
        // Give it a name and age
        Dog dog = new Dog();
        dog.name = "Neo";
        dog.age = 1;

        // Create a Cat object
        // Give it a name and age
        Cat cat = new Cat();
        cat.name = "Whisker";
        cat.age = 3;


        // Call the inherited eat() method
        // for both animals
        dog.eat();
        cat.eat();


        // Call bark() for the dog
        dog.bark();

        // Call meow() for the cat
        cat.meow();
    }
}