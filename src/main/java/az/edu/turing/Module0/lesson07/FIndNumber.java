package az.edu.turing.Module0.lesson07;

import java.util.Scanner;

public class FIndNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 1;
        while (i <= number) {
            if (number % 1 == 0) {
                System.out.print(i);
            }
            i++;
        }

    }
}
