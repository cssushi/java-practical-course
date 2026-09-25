public class Parameters {

    public static void main(String[] args) {

        /*
         * Create and call the following methods:
         *
         * 1. greet()
         *
         * Input:
         * "Sushant"
         *
         * Output:
         * Hello, Sushant!
         *
         *
         * 2. square()
         *
         * Input:
         * 7
         *
         * Output:
         * Square: 49
         *
         *
         * 3. introduce()
         *
         * Inputs:
         * "Sushant"
         * 20
         * "Computer Science"
         *
         * Output:
         * Name: Sushant
         * Age: 20
         * Course: Computer Science
         *
         * Make the methods accept the required data
         * as parameters.
         */

        greet("Sushant");
        square(7);
        introduce("Sushant", 20,"Computer Science");

    }

    static void greet(String name) {
        System.out.printf("Hello, %s!%n", name);
    }

    static void square(int num) {
        System.out.printf("Square: %d%n", num * num);
    }

    static void introduce(String name, int age, String course) {
        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Course: %s%n", course);
    }
}