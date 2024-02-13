package az.edu.turing.e_olymp_tasks.Section4Rewind;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double y = ((Math.sqrt(Math.pow(x, 4) + 1)) / Math.pow(x, 2)) - (Math.sqrt(Math.pow(x, 2) / (Math.pow(x, 2) + 1)));
        System.out.printf("%.3f%n",y);
    }
}
