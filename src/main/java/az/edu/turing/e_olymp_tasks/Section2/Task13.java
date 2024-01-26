package az.edu.turing.e_olymp_tasks.Section2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y;
        if (x < 5) {
            System.out.println(y=(int)Math.pow(x,2)-3*x+4);
        } else if (x >= 5) {
            System.out.println(y = x + 7);
        }

    }
}
