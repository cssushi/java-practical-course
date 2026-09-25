public class ReturnValues {

    public static void main(String[] args) {

        /*
         * Create these methods:
         *
         * 1. square(int number)
         *
         * Input:
         * 7
         *
         * Should RETURN:
         * 49
         *
         *
         * 2. add(int a, int b)
         *
         * Input:
         * 15, 27
         *
         * Should RETURN:
         * 42
         *
         *
         * 3. calculateArea(double radius)
         *
         * Input:
         * 5
         *
         * Should RETURN the area of the circle.
         *
         * Use 3.14159 as PI.
         *
         *
         * 4. getGrade(int marks)
         *
         * Input:
         * 85
         *
         * Should RETURN:
         * "B"
         *
         * Rules:
         * 90+ -> A
         * 80-89 -> B
         * 70-79 -> C
         * 60-69 -> D
         * below 60 -> F
         *
         *
         * Print the returned values from main().
         *
         * IMPORTANT:
         * The methods themselves should NOT print anything.
         * They should calculate/produce a value and return it.
         */

        System.out.println("Square of 7: " + square(7));
        System.out.println("Add 5 and 7: " + add(5, 7));
        System.out.println("Area of circle with radius 5: " + calculateArea(5));
        System.out.println("Grade with 83 marks: " + getGrade(83));
    }

    static int square(int number) {
        return number * number;
    }

    static int add(int a, int b) {
        return a + b;
    }

    static double calculateArea(double radius) {
        final double PI = 3.14159;
        return PI * (radius * radius);
    }

    static char getGrade(int marks) {

        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}