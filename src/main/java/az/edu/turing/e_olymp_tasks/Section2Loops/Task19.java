package az.edu.turing.e_olymp_tasks.Section2Loops;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degree = scanner.nextInt();
        if (degree>0){
            System.out.println("Water");
        }else {
            System.out.println("Ice");
        }
    }
}
