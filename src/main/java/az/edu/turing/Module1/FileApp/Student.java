package az.edu.turing.Module1.FileApp;

public class Student {
    private int id ;
    private int age;
    private double grade;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, int age, double grade, String name) {
        this.id = id;
        this.age = age;
        this.grade = grade;
        this.name = name;


    }
}

