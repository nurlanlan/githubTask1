package az.edu.turing.Module1.Lesson09;

import java.awt.*;
import java.util.ArrayList;

public class StudentApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 20, 3.5));
        students.add(new Student(2, "Bob", 21, 3.2));
        students.add(new Student(3, "Charlie", 19, 3.9));

        // Print the list of students
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
