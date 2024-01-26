package az.edu.turing.e_olymp_tasks.Section3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();
       if (numbers[0]<numbers[1] && numbers[1]<numbers[2]){
           System.out.println(numbers[1]);
       } else if (numbers[1]<numbers[0]&& numbers[0]<numbers[2]) {
           System.out.println(numbers[0]);
       } else if (numbers[0]<numbers[2]&&numbers[2]<numbers[1]) {
           System.out.println(numbers[2]);

       }


    }
}
