public class IfElse {

    public static void main(String[] args) {

        int marks = 73;

        /*
         * YOUR TASK:
         *
         * Produce EXACTLY one of these results depending on marks:
         *
         * 90-100  -> Grade: A
         * 80-89   -> Grade: B
         * 70-79   -> Grade: C
         * 60-69   -> Grade: D
         * below 60 -> Grade: F
         *
         * Also print:
         *
         * Passed: true
         *
         * A student passes with 40 or more marks.
         *
         * Don't change the marks variable.
         */

        System.out.print("Grade: ");
        if (marks > 89) {
            System.out.println('A');
        } else if (marks > 79) {
            System.out.println('B');
        } else if (marks > 69) {
            System.out.println('C');
        } else if (marks > 59) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }

        System.out.println("Passed: " + (marks >= 40));
    }
}