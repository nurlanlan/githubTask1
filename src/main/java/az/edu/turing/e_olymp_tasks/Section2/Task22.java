package az.edu.turing.e_olymp_tasks.Section2;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n / 1000;
        int b = n / 100 % 10;
        int c = n / 10 % 10;
        int d = n % 10;
        if (a != 0 && b != 0 && c != 0 && d != 0) {
            if (n % a == 0 && n % b == 0 && n % c == 0 && n % d == 0 && a != 0 && b != 0 && c != 0 && d != 0)
                System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
