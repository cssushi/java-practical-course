public class DataTypes {

    public static void main(String[] args) {

        byte x = 100;
        short y = 10000;
        int age = 20;
        double height = 5.9;
        float temperature = 25.5f; // java treats normal decimal as double, therefore f at end
        long population = 1400000000L; // java thinks this is an int, hence L
        char grade = 'A';
        boolean isStudent = true;
        String name = "Raj";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Temperature: " + temperature);
        System.out.println("Population: " + population);
        System.out.println("Grade: " + grade);
        System.out.println("Student: " + isStudent);
    }
}
