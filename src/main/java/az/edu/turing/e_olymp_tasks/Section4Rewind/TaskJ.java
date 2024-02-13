package az.edu.turing.e_olymp_tasks.Section4Rewind;

import java.util.Scanner;

public class TaskJ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        while (n != 1){
            if (n%2 == 0){
                n = n/2;
            }else n = n+1 ;
            i++;
        }
        System.out.println(i);
    }
}