package az.edu.turing.e_olymp_tasks.Section2Loops;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 100 && number <= 999) {
            int a = number / 100;
            int b = number / 10 % 10;
            int c = number % 10;
            System.out.println(a * b * c);

        } else System.out.println("Invalid value");
    }
}