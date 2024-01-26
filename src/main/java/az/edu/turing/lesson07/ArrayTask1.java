package az.edu.turing.lesson07;

import java.util.Scanner;

public class ArrayTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter digit no: " + i);
            int digit = scanner.nextInt();
            int[] array = new int[digit];
            array[i] = digit;
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%d\t",array[digit]);
            }

        }

    }
}
