package az.edu.turing.e_olymp_tasks.Section2;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (x < a || x > b) {
            System.out.println("OUT");
        } else System.out.println("IN");
    }
}
