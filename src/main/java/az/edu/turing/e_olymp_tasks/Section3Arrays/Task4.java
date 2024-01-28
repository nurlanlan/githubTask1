package az.edu.turing.e_olymp_tasks.Section3Arrays;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        if (a > b && a > c) {
            System.out.printf("%.2f\n",a);
        } else if (b > c) {
            System.out.printf("%.2f\n",b);

        } else System.out.printf("%.2f\n",c);


    }
}
