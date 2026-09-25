import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        System.out.println("\nResults:");
        System.out.println("Sum: " + (first + second));
        System.out.println("Difference: " + (first - second));
        System.out.println("Product: " + (first * second));
        System.out.println("Quotient: " + (first / second));
        System.out.println("Remainder: " + (first % second));

        sc.close();
    }
}