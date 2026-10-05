class Student {

    // Create instance variables for:
    // name
    // age
    // course
    String name;
    int age;
    String course;


    // Create an instance method called introduce()
    // It should print the student's information
    void introduce() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class ClassesObjects {
    public static void main(String[] args) {

        // Create two Student objects
        Student student1 = new Student();
        Student student2 = new Student();

        // Give each student different values
        student1.name = "Sushant";
        student1.age = 20;
        student1.course = "Computer Science";

        student2.name = "Raj";
        student2.age = 21;
        student2.course = "Mathematics";

        // Call introduce() for both students

        System.out.println("Student 1: ");
        student1.introduce();

        System.out.println();

        System.out.println("Student 2: ");
        student2.introduce();

    }
}