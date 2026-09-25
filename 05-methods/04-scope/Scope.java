public class Scope {

    public static void main(String[] args) {

        int number = 10;
        System.out.println("Main number: " + number);

        if (true) {
            int blockNumber = 100;
            System.out.println("Block number: " + blockNumber);
        }

        showNumber();
    }

    static void showNumber() {

        int number = 50;
        System.out.println("Method number: " + number);
    }
}