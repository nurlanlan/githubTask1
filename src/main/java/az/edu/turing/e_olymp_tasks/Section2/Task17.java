package az.edu.turing.e_olymp_tasks.Section2;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (n % a == 0 && n % b == 0) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
