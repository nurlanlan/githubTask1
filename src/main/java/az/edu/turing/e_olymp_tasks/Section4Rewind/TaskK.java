package az.edu.turing.e_olymp_tasks.Section4Rewind;

import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        int num = 1;
        for (int i = 0; i < n; i++) {  //column
            for (int j = 0; j < n; j++) { //row
                array[i][i] = num;
                System.out.print(array[i][i] + " ");
                num++;
            }
            System.out.println();
        }

    }
}
