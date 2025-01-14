class Student 
{
    String name;
    long enrollmentNumber;
    String course;
    int age;

    public Student(String name,long enrollmentNumber,String course,int age)
    {
        this.name = name;
        this.enrollmentNumber = enrollmentNumber;
        this.course = course;
        this.age = age;
    }
    public void data()
    {
        System.out.println("Name: "+name);
        System.out.println("Enrollment Number: "+enrollmentNumber);
        System.out.println("Course name: "+course);
        System.out.println("Age "+age);
    }
}
public class Main
{
    public static void main(String[] args) 
    {
        Student student1 = new Student("Vanshika Shrivastava", 35, "Computer Science And Engineering", 21);
        Student student2 = new Student("Ayushi Kothari", 5, "Mechanical Engineering", 22);
        Student student3 = new Student("Amit Sharma", 14, "Electrical And Electronics Engineering", 22);

        System.out.println("Student 1 Details:");
        student1.data();

        System.out.println("Student 2 Details:");
        student2.data();

        System.out.println("Student 3 Details:");
        student3.data();

    }




    


}