package az.edu.turing.e_olymp_tasks.Section2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMonth = scanner.nextInt();
        if (numberOfMonth >= 1 && numberOfMonth <= 12) {
            if (numberOfMonth >= 3 && numberOfMonth <= 5) {
                System.out.println("Spring");
            } else if (numberOfMonth >= 6 && numberOfMonth <= 8) {
                System.out.println("Summer");
            } else if (numberOfMonth >= 9 && numberOfMonth <= 11) {
                System.out.println("Autumn");
            } else System.out.println("Winter");
        } else System.out.println("Enter valid value");
    }
}
