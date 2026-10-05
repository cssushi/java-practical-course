public class Finally {
    public static void main(String[] args) {

        System.out.println("Case 1: Exception");

        try {
            // Cause an ArithmeticException
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Cannot divide by 0");
        } finally {
            // Add code that must run afterward
            System.out.println("This runs anyway");
        }

        System.out.println();

        System.out.println("Case 2: No Exception");

        try {
            // Perform a successful division
            int result = 10 / 2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Never really runs");
        } finally {
            // Add code that must run afterward
            System.out.println("This runs anyway again");
        }
    }
}