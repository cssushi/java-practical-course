class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        // Call the parent constructor
        super(name);
        // Initialize the child field
        this.breed = breed;
    }

    void showInfo() {
        // Print the parent's name using super
        System.out.println("Name: " + super.name);
        // Call the parent's eat() method using super
        super.eat();
        // Print the dog's breed
        System.out.println("Breed: " + this.breed);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {

        Dog dog = new Dog("Neo", "Himalayan Shepherd");

        dog.showInfo();
    }
}