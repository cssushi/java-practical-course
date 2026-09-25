public class BreakContinue {

    public static void main(String[] args) {

        /*
         * PART 1
         *
         * Produce:
         *
         * 1
         * 2
         * 3
         * 4
         * 5
         *
         * Stop the loop completely at 5.
         *
         *
         * PART 2
         *
         * Produce the numbers 1 through 10,
         * BUT skip 5.
         *
         * Expected:
         *
         * 1
         * 2
         * 3
         * 4
         * 6
         * 7
         * 8
         * 9
         * 10
         *
         *
         * PART 3
         *
         * Produce:
         *
         * 1
         * 2
         * 3
         * 4
         * 6
         * 7
         *
         * Stop completely at 8.
         *
         * Use both break and continue where appropriate.
         */

        int count = 1;
        while (true) {
            System.out.println(count);
            count++;

            if (count == 6) {
                break;
            }
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println();
        System.out.println();
        int newCount = 1;
        while (true) {

            if (newCount == 8) {
                break;
            }

            System.out.println(newCount);
            newCount++;
        }
    }
}