
public class BasicMethods {

    public static void main(String[] args) {

        /*
         * YOUR TASK
         *
         * Create three methods outside main():
         *
         * 1. printHeader()
         *
         *    Should produce:
         *
         *    ====================
         *       JAVA PROGRAM
         *    ====================
         *
         *
         * 2. printMessage()
         *
         *    Should produce:
         *
         *    Learning Java!
         *
         *
         * 3. printFooter()
         *
         *    Should produce:
         *
         *    ====================
         *          DONE
         *    ====================
         *
         *
         * Then call all three methods from main()
         * in the correct order.
         */


        printHeader();
        printMessage();
        printFooter();
    }

    static void printHeader() {
    System.out.println("====================");
    System.out.println("   JAVA PROGRAM");
    System.out.println("====================");
    }

    static void printMessage() {
        System.out.println("Learning Java!");
    }

    static void printFooter() {
        System.out.println("====================");
        System.out.println("      DONE");
        System.out.println("====================");
    }

}