package az.edu.turing.StudentApplication.model.dto;

public class StudentDto {
    public final String pin;
    public final String password;
    public final Double grade;
    public final int age;

    public StudentDto(String pin, String password, Double grade, int age) {
        this.pin = pin;
        this.password = password;
        this.grade = grade;
        this.age = age;
    }
}
