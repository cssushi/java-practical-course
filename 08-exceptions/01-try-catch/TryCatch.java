public class TryCatch {
    public static void main(String[] args) {

        System.out.println("Program started.");

        // Put the risky operation inside try
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        // Catch the appropriate exception


        System.out.println("Program continued.");
    }
}