package az.edu.turing.e_olymp_tasks.Section4Rewind;

import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
        int[][] array = new int[numRows][2];
        for (int i = 0; i < numRows; i++) {
            array[i][0] = scanner.nextInt();
            array[i][1] = scanner.nextInt();
        }
        for (int i = 0; i < numRows; i++) {
            int sum = array[i][0] + array[i][1];
            System.out.println(sum);
        }
    }
}