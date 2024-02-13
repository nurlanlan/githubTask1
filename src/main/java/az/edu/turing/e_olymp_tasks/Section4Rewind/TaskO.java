package az.edu.turing.e_olymp_tasks.Section4Rewind;

import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && b == c) {
            System.out.println(1);
        } else if (a == b || a == c || b == c) {
            System.out.println(2);
        }else System.out.println(3);
    }
}
