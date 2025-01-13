class Student {
    String name;
    int rollNumber;
    String course;
    int age;

    public Student(String name, int rollNumber, String course, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
        this.age = age;
    }

    public void details() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
        System.out.println("Age: " + age);
        System.out.println(); 
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Vanshika Shrivastava", 35, "Computer Science And Engineering", 21);
        Student student2 = new Student("Ayushi Kothari", 5, "Mechanical Engineering", 22);
        Student student3 = new Student("Amit Sharma", 14, "Electrical And Electronics Engineering", 22);

        System.out.println("Student 1 Details:");
        student1.details();

        System.out.println("Student 2 Details:");
        student2.details();

        System.out.println("Student 3 Details:");
        student3.details();
    }
}