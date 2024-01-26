package az.edu.turing.e_olymp_tasks.Section2;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0) {
            System.out.println("1");
        } else if (n == 0) {
            System.out.println("0");

        } else if (n < 0) {
            System.out.println("-1");

        }

    }
}
