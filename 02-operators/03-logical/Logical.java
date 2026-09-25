public class Logical {

    public static void main(String[] args) {

        int age = 20;
        boolean hasID = true;

        System.out.println("AND: " + (age >= 18 && hasID));
        System.out.println("OR: " + (age >= 18 || hasID));
        System.out.println("NOT: " + !hasID);

        int score = 75;

        boolean passed = score >= 40 && score <= 100;
        boolean distinction = score >= 75;

        System.out.println("Passed: " + passed);
        System.out.println("Distinction: " + distinction);
    }
}