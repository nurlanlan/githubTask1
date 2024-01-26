package az.edu.turing.lesson08;

import java.util.Scanner;

public class DimensionalArrayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] xy = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                xy[i][j] = 1;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(xy[i][j] + " ");
            }
            System.out.println();
        }

    }
}
