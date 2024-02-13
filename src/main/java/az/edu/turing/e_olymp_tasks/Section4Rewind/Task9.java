package az.edu.turing.e_olymp_tasks.Section4Rewind;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Y = scanner.nextInt(); // istifadecinin daxil etdiyi umumi pul
        int cem = 1;
        for (int i = 1; i < 100; i++) {
            cem = cem + i*2 +i;
            if (cem>Y) break;
            System.out.println(i);


        }



    }
}
