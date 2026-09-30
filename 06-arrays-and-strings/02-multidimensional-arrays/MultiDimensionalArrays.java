public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][] marks = {
            {80, 90, 70},
            {75, 85, 95},
            {60, 70, 80}
        };

        // Print every student's marks
        for (int row = 0; row < marks.length; row++) {
            System.out.print("Student " + (row + 1) + ": ");

            for (int col = 0; col < marks[row].length; col++) {
                System.out.print(marks[row][col] + " ");
            }

            System.out.println();
        }

        // Calculate and print each student's average
        float classSum = 0;

        for (int row = 0; row < marks.length; row++) {
            float sum = 0;

            for (int col = 0; col < marks[row].length; col++) {
                sum += marks[row][col];
            }

            float currentAverage = sum / marks[row].length;

            System.out.printf(
                "Student %d average: %.2f%n",
                row + 1,
                currentAverage
            );

            classSum += sum;
        }

        // Calculate and print the class average
        int numberOfMarks = 0;

        for (int row = 0; row < marks.length; row++) {
            numberOfMarks += marks[row].length;
        }

        System.out.printf(
            "Class average: %.2f%n",
            classSum / numberOfMarks
        );
    }
}