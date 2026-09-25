public class WhileLoops {

    public static void main(String[] args) {

        /*
         * YOUR TASK:
         *
         * Produce:
         *
         * Countdown: 10
         * Countdown: 9
         * Countdown: 8
         * ...
         * Countdown: 1
         * Blast off!
         *
         * Then produce:
         *
         * 1
         * 4
         * 7
         * 10
         * 13
         * 16
         * 19
         *
         * Use while loops for both tasks.
         *
         * For the second loop, increase the number by 3 each time.
         */

        int count = 10;
        while (count >= 1) {
            System.out.println("Countdown: " + count);
            count--;
        }

        System.out.println("Blast off!");

        System.out.println();
        System.out.println();
        System.out.println();

        int num = 1;
        while (num <= 19) {
            System.out.println(num);
            num += 3;
        }

    }
}