package az.edu.turing.e_olymp_tasks.Section2Loops;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y;
        if (x > 7) {
            System.out.println(y = (int) Math.pow(x, 3) + 2 * x);
        } else if (x < -4) {
            System.out.println(y = x + 5);
        } else {
            System.out.println(y = (int) Math.pow(x, 2) - 3 * x);

        }

    }
}