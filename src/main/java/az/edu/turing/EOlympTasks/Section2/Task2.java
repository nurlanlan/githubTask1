package az.edu.turing.EOlympTasks.Section2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();
        if (mark >= 1 && mark <= 3) {
            System.out.println("Initial");
        } else if (mark >= 4 && mark <= 6) {
            System.out.println("Average");
        } else if (mark >= 7 && mark <= 9) {
            System.out.println("Sufficient");
        } else if (mark >= 10 && mark <= 12) {
            System.out.println("High");
        } else
            System.out.println("Enter valid mark");
    }
}
