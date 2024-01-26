package az.edu.turing.e_olymp_tasks.Section2Loops;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a % b == 0) {
            System.out.println("Divisable");
        } else {
            System.out.println((a / b) + " " + (a % b));
        }
    }
}
