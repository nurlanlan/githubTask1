package az.edu.turing.e_olymp_tasks.Section2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        a = a % 2;
        b = b % 2;
        if (a == b) {
            System.out.println("1");
        } else System.out.println("0");
    }
}
