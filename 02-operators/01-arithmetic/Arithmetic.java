public class Arithmetic {

    public static void main(String[] args) {

        int a = 17;
        int b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        double x = 17;
        double y = 5;

        System.out.println("Decimal division: " + (x / y));

        System.out.println("Without parentheses: " + 10 + 5 * 2);
        System.out.println("With parentheses: " + ((10 + 5) * 2));
    }
}