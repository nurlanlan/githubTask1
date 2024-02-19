package az.edu.turing.Module1.Lesson02;

public class Student {
    public static int studentCount = 0;
    public String name;
    public double grade;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        studentCount++;
    }
}
