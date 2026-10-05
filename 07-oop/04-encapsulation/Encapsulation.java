class Student {

    // Make these fields private
    // name, age, course
    private String name;
    private int age;
    private String course;


    // Constructor
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Create a getter for name
    public String getName() {
        return this.name;
    }

    // Create a setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Create a getter for age
    public int getAge() {
        return this.age;
    }

    // Create a setter for age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
    // Only allow age >= 0


    // Create a getter for course
    public String getCourse() {
        return this.course;
    }


    // Create a setter for course
    public void setCourse(String course) {
        this.course = course;
    }


    void introduce() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Student student = new Student(
            "Sushant",
            20,
            "Computer Science"
        );

        // Print the student's age using the getter
        System.out.println("Original age: " + student.getAge());

        // Change the age to 21 using the setter
        student.setAge(21);


        // Try setting the age to -100
        student.setAge(-100);


        // Print the age again
        // It should still be 21
        System.out.println("Updated age: " + student.getAge());

        student.introduce();
    }
}