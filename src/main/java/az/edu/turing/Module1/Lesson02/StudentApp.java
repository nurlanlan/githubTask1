package az.edu.turing.Module1.Lesson02;

public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student("Elvin #1", 28);
        System.out.println(student1.name);
        System.out.println(student1.grade);
        System.out.println(student1.age);
        System.out.println(student1);
        System.out.println(Student.studentCount);
        student1.studentCount = 14;

        Student student2 = new Student("Elvin #2", 29);
        System.out.println(student2.name);
        System.out.println(student2.grade);
        System.out.println(student2.age);
        System.out.println(student2);
        System.out.println(student2.studentCount);
        System.out.println(Student.studentCount);

    }
}
