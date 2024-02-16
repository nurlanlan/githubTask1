package az.edu.turing.Lesson15;

public class HomeWorkStudentList {
    public static void main(String[] args) {
        StudentID student1 = new StudentID("Nurlan", 20, 91);
        StudentID student2 = new StudentID("Elvin", 39, 13);
        System.out.println(student1.name);
        System.out.println(student1);
        System.out.println(student1.grade);
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.grade);

    }
}
