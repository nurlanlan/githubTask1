package az.edu.turing.StudentApplication.Dao;
import java.util.Objects;

public class StudentEntity {
    public final String pin;
    public final String password;
    public final Double grade;
    public final int age;
    public int studentId;

    public StudentEntity(String pin, String password, Double grade, int age, int studentId) {
        this.pin = pin;
        this.password = password;
        this.grade = grade;
        this.age = age;
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity student = (StudentEntity) o;
        return studentId == student.studentId && Objects.equals(pin, student.pin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pin, studentId);
    }



    @Override
    public String toString() {
        return "{pin='%s', password='%s', grade=%s, age=%d, studentId=%d}".formatted(pin, password, grade, age, studentId);
    }
}
