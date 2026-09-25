public class ForLoops {

    public static void main(String[] args) {

        /*
         * YOUR TASK:
         *
         * Produce EXACTLY:
         *
         * Number: 1
         * Number: 2
         * Number: 3
         * Number: 4
         * Number: 5
         * Number: 6
         * Number: 7
         * Number: 8
         * Number: 9
         * Number: 10
         *
         * Then produce:
         *
         * 10
         * 8
         * 6
         * 4
         * 2
         *
         * Then produce the multiplication table for 5:
         *
         * 5 x 1 = 5
         * 5 x 2 = 10
         * ...
         * 5 x 10 = 50
         *
         * Use for loops for all three tasks.
         */

        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
        }

        System.out.println();
        System.out.println();

        for (int i = 10; i >= 2; i -= 2) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("5 x %d = %d%n", i, 5 * i);
        }

    }
}