package az.edu.turing.Module0.lesson06;

import java.util.Scanner;

public class MarkByPercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the percentage: ");
        double percentage = scanner.nextDouble();
        String grade;
        if (percentage >= 91) {
            grade = "A";
        } else if (percentage >= 81) {
            grade = "B";
        } else if (percentage >= 71) {
            grade = "C";
        } else if (percentage >= 61) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Grade: " + grade);
    }

}
