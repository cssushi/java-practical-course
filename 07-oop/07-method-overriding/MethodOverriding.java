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

    void showBoth() {
        // Call the Dog version
        this.sound();
        // Call the Animal version using super
        super.sound();
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();
        dog.showBoth();
    }
}