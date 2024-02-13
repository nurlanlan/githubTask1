package az.edu.turing.e_olymp_tasks.Section4Rewind;

import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int columns = scanner.nextInt();
        int[][] array = new int[1][columns];
        for (int i = 0; i < columns; i++) {
            array[0][i] = scanner.nextInt();
        }
        for (int i = 0; i < columns; i++) {
            if (array[0][i] > 0) {
                array[0][i] = array[0][i] + 2;
            }
        }
        for (int i = 0; i < columns; i++) {
            System.out.print(array[0][i] + " ");
        }
    }
}
