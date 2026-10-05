public class ThrowExample {

    static void checkAge(int age) {
        // Throw IllegalArgumentException if age is below 18
        if (age < 18) {
            throw new IllegalArgumentException("Age is below 18");
        }

        System.out.println("Age accepted: " + age);
    }

    public static void main(String[] args) {

        System.out.println("Checking age...");

        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continued.");
    }
}