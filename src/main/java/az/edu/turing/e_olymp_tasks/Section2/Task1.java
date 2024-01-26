package az.edu.turing.e_olymp_tasks.Section2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 10 && number <= 99) {
            int tensDigit = number / 10;
            int onesDigit = number % 10;

            System.out.println(tensDigit + " " + onesDigit);
        } else {
            System.out.println("Please enter a valid 2-digit number.");
        }
    }
}


