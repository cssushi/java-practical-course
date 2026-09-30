import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Print the length of the name
        System.out.println("Length: " + name.length());

        // Print the first character
        System.out.println("First character: " + name.charAt(0));

        // Print the last character
        System.out.println("Last character: " + name.charAt(name.length() - 1));

        // Print the name in uppercase
        System.out.println("Uppercase: " + name.toUpperCase());

        // Print the name in lowercase
        System.out.println("Lowercase: " + name.toLowerCase());

        // Print the first 3 characters
        System.out.println("First 3 characters: " + name.substring(0, 3));

        // Check whether the name is "Sushant"
        System.out.println("Is Sushant: " + name.equals("Sushant"));

        sc.close();
    }
}