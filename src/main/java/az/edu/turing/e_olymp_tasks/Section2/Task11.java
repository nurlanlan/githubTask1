package az.edu.turing.e_olymp_tasks.Section2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number<0){
            System.out.println("Negative");
        } else if (number>0) {
            System.out.println("Positive");
        }else System.out.println("Zero");
    }
}
