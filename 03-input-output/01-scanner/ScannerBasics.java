
// 1. Import the Scanner class.
import java.util.Scanner;

public class ScannerBasics {
    public static void main(String[] args) {

        // 2. Create a Scanner that reads from the keyboard.

        Scanner sc = new Scanner(System.in);

        // 3. Ask the user for their name.
        // 4. Store their name in a String.

        System.out.print("Name: ");
        String name = sc.next();

        // 5. Ask for their age.
        // 6. Store their age in an int.
        
        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("Height: ");
        double height = sc.nextDouble();

        // leaves newline (both nextInt and nextDouble)
        // consume nextLine
        sc.nextLine();

        System.out.print("Full name: ");
        String full_name = sc.nextLine();

        // 7. Print all values.

        System.out.println("Output:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Full name: " + full_name);
        // 8. Close the Scanner.

        sc.close();

    }
}