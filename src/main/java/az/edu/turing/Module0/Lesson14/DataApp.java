package az.edu.turing.Module0.Lesson14;

public class DataApp {
    public static void main(String[] args) {
        String[] name = {"Nurlan", "Vusal", "Elmir", "Aytekin"};
        int[] grade = {45, 66, 78, 32};
        int[] age = {20, 20, 19, 37};
        int max = 0;

        for (int i = 0; i < grade.length; i++) {
            if (grade[i] > max) {
                max = grade[i];

                System.out.println(name[i]);
                System.out.println(age[i]);
                System.out.println(grade[i]);
            }
            System.out.println();
        }
    }
}
