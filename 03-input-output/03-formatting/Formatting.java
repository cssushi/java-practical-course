public class Formatting {

    public static void main(String[] args) {

        String name = "Sushant";
        int age = 20;
        double height = 5.58742;
        double balance = 15243.56789;

        /*
         * YOUR TASK:
         *
         * Make the output look EXACTLY like this:
         *
         * ==============================
         *        STUDENT PROFILE
         * ==============================
         * Name:      Sushant
         * Age:       20
         * Height:    5.59 m
         * Balance:   ₹15243.57
         * ==============================
         *
         * Requirements:
         * - Use printf() for the formatted values.
         * - Height must show exactly 2 decimal places.
         * - Balance must show exactly 2 decimal places.
         * - Use formatting to make the labels line up.
         * - Use %n or escape sequences where appropriate.
         *
         * Don't change the variables above.
         */

        System.out.println("==============================");
        System.out.println("       STUDENT PROFILE");
        System.out.println("==============================");

        System.out.printf("%-10s%s\n", "Name:", name);
        System.out.printf("%-10s%d\n", "Age:", age);
        System.out.printf("%-10s%.2f\n", "Height:", height);
        System.out.printf("%-10s%c%.2f\n", "Balance:", '₹', balance);

        System.out.println("==============================");

    }
}