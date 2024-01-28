package az.edu.turing.e_olymp_tasks.Section2Loops;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n%2==0){
            System.out.println(n+1);
        }else System.out.println(n+2);

    }
}