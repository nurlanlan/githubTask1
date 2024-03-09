package az.edu.turing.Module1.Quiz6Rewind.Q1;

public class Student extends Person{
    private String university = "BDU";
    public void introduce(){
        super.introduce();
        System.out.println("I study at "+ university);
    }
}
