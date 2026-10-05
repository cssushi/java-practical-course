import java.io.IOException;

public class ThrowsExample {

    static void checkConnection() throws IOException {
        // Throw an IOException here
        throw new IOException("Connection failed.");
    }

    public static void main(String[] args) {

        System.out.println("Checking connection...");

        try {
            checkConnection();
        } catch (IOException e) {
            System.out.println("Connection error: " + e.getMessage());
        }

        System.out.println("Program continued.");
    }
}