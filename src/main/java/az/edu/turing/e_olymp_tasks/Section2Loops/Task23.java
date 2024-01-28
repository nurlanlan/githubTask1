package az.edu.turing.e_olymp_tasks.Section2Loops;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a*b>0) {
            System.out.println("1");
        }else if (a*b<0){
            System.out.println("0");
        }else System.out.println("Enter valid value");
    }
}
