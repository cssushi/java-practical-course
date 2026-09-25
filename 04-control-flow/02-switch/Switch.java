public class Switch {

    public static void main(String[] args) {

        int day = 3;

        /*
         * YOUR TASK:
         *
         * Print the day corresponding to the number:
         *
         * 1 -> Monday
         * 2 -> Tuesday
         * 3 -> Wednesday
         * 4 -> Thursday
         * 5 -> Friday
         * 6 -> Saturday
         * 7 -> Sunday
         *
         * Anything else:
         *
         * Invalid day
         *
         * Expected output with day = 3:
         *
         * Day: Wednesday
         *
         * Use switch, case, break and default.
         */

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;
            
            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;
            
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day");
        }

    }
}