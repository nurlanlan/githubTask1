package az.edu.turing.Module1.Quiz6Rewind.Q2;

import az.edu.turing.Module1.Quiz6Rewind.Q1.Person;
import az.edu.turing.Module1.Quiz6Rewind.Q1.Student;

public class App {
    public static void main(String[] args) {
        Student student = new Student();
        Person person1 = new Person();
        Person person2 = new Student();

        System.out.println(student instanceof Person);
        System.out.println(person1 instanceof Student);
        System.out.println(person2 instanceof Student);
    }
}
