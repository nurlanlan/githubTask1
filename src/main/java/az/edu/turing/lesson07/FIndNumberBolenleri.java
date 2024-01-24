package az.edu.turing.lesson07;

import java.util.Scanner;

public class FIndNumberBolenleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            int x = number % i;
            if (x == 0) {
                System.out.println(i);

            }
        }

    }
}
