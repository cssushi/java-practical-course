import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Check if the sentence contains "Java"
        System.out.println("Contains Java: " + text.contains("Java"));

        // Check if the sentence starts with "Java"
        System.out.println("Starts with Java: " + text.startsWith("Java"));

        // Check if the sentence ends with "!"
        System.out.println("Ends with !: " + text.endsWith("!"));

        // Find the position of "Java"
        System.out.println("Position of Java: " + text.indexOf("Java"));

        // Replace "Java" with "Python"
        String replaced = text.replace("Java", "Python");
        System.out.println(replaced);

        // Remove leading/trailing spaces
        // Try this with a separate String containing spaces.
        String trailing = "   This contains trailing spaces  ";
        System.out.println("Trailing: " + trailing);

        System.out.println("Fixed: " + trailing.trim());


        // Split the sentence into words
        // Print each word on a separate line.
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        sc.close();
    }
}