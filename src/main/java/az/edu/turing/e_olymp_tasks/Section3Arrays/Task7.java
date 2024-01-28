package az.edu.turing.e_olymp_tasks.Section3Arrays;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = 3;
        char[][] array = new char[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = '#';
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
