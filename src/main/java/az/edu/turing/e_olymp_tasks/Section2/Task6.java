package az.edu.turing.e_olymp_tasks.Section2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 1000 && number <= 9999) {
            int a = number / 1000;
            int b = number % 10;
            System.out.println(a + b);

        } else System.out.println("Invalid value");
    }
}