package az.edu.turing.e_olymp_tasks.Section2;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y;
        if (x >= 10) {
            System.out.println(y = (int) Math.pow(x, 3) + 5 * x);
        } else if (x < 10) {
            System.out.println(y = (int) Math.pow(x, 2) - 2 * x + 4);
        }

    }
}
