class Student {

    // Create instance variables
    // name, age, course
    String name;
    int age;
    String course;


    // Create a parameterized constructor
    // It should receive name, age and course
    // Use different parameter names so you don't need this yet
    Student (String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Create introduce() method
    // Print the student's information
    void introduce() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

}

public class ThisKeyword {
    public static void main(String[] args) {

        // Create two Student objects using the constructor
        Student student1 = new Student("Sushant", 20, "Computer Science");
        Student student2 = new Student("Raj", 21, "Mathematics");


        // Call introduce() for both objects
        
        System.out.println("Student 1: ");
        student1.introduce();

        System.out.println();

        System.out.println("Student 2: ");
        student2.introduce();

    }
}