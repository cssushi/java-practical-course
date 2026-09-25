public class MethodOverloading {

    public static void main(String[] args) {

        /*
         * Create overloaded methods called calculate().
         *
         * Version 1:
         * Accept two ints and return their sum.
         *
         * Version 2:
         * Accept three ints and return their sum.
         *
         * Version 3:
         * Accept two doubles and return their sum.
         *
         * Then produce:
         *
         * 2 ints: 15
         * 3 ints: 30
         * 2 doubles: 7.5
         *
         * Call all three versions from main().
         */

        System.out.println("2 ints: " + calculate(5, 10));
        System.out.println("3 ints: " + calculate(10, 10, 10));
        System.out.println("2 doubles: " + calculate(2.5, 5.0));

    }

    static int calculate(int x, int y) {
        return x + y;
    }

    static int calculate(int x, int y, int z) {
        return x + y + z;
    }

    static double calculate(double x, double y) {
        return x + y;
    }
}