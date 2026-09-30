public class Arrays {

    public static void main(String[] args) {

        /*
         * You have these marks:
         *
         * 72, 91, 64, 88, 45, 79
         *
         * Store them in an array.
         *
         * Then produce:
         *
         * Number of students: 6
         * First mark: 72
         * Last mark: 79
         *
         * After changing the 5th student's mark to 55:
         *
         * Updated marks:
         * 72
         * 91
         * 64
         * 88
         * 55
         * 79
         *
         * Finally calculate and print:
         *
         * Total: 449
         * Average: 74.833333...
         *
         * Use the array for all of this.
         *
         * Don't manually add the six numbers one by one.
         */

        int[] marks = {72, 91, 64, 88, 45, 79};

        System.out.println("Number of students: " + marks.length);
        System.out.println("First mark: " + marks[0]);
        System.out.println("Last mark: " + marks[marks.length - 1]);

        marks[4] = 55;

        int sum = 0;

        System.out.println("Updated marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

            sum += marks[i];
        }

        System.out.println("Total: " + sum);
        System.out.println("Average: " + sum / (float) marks.length);
    }
}