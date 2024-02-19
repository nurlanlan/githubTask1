package az.edu.turing.Module1.Lesson03;

public class Person {
    private  String name;
    private int age;
    private double height;
    private boolean gender;

    public Person(String name, int age, double height, boolean gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
    }
    public void wakeUp(){
        System.out.println("Oyanmaq");
    }
}
