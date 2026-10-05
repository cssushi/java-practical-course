class InvalidAgeException extends Exception {

    // Create a constructor that accepts a message
    InvalidAgeException(String message) {
        super(message);
    }
    // and passes it to Exception
}

public class CustomExceptions {

    static void checkAge(int age) throws InvalidAgeException {

        // If age is below 18, throw InvalidAgeException
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }

        System.out.println("Age accepted: " + age);
    }

    public static void main(String[] args) {

        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continued.");
    }
}