public class DoWhile {

    public static void main(String[] args) {

        /*
         * YOUR TASK:
         *
         * PART 1
         * Produce:
         *
         * Number: 1
         * Number: 2
         * Number: 3
         * Number: 4
         * Number: 5
         *
         * Use do-while.
         *
         *
         * PART 2
         * Create a do-while loop whose condition is
         * FALSE before the loop starts.
         *
         * It should STILL print:
         *
         * This ran once!
         *
         *
         * PART 3
         * Recreate PART 2 using a normal while loop.
         *
         * It should print NOTHING.
         *
         * The goal is to actually observe the difference.
         */

        int count = 1;
        do {
            System.out.println("Number: " + count);
            count++;
        } while (count <= 5);

        // part 2

        boolean condition = false;
        do {
            System.out.println("This ran once!");
        } while (condition);

        // part 3
        while (condition) {
            System.out.println("This shouldn't have run");
        }

    }
}