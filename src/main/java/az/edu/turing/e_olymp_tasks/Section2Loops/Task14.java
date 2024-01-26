package az.edu.turing.e_olymp_tasks.Section2Loops;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextInt();
        long y;
        if (x >= 10) {
            System.out.println(y = (long) Math.pow(x, 3) + 5 * x);
        } else if (x < 10) {
            System.out.println(y = (long) Math.pow(x, 2) - 2 * x + 4);
        }

    }
}
