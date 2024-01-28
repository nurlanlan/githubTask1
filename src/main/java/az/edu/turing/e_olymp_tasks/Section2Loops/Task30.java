package az.edu.turing.e_olymp_tasks.Section2Loops;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n%2==0 || n%3==0 && n<0){
            System.out.println("YES");
        } else if (n%2==0 && n%3==0 && n<0) {
            System.out.println("NO");
        }else System.out.println("NO");

    }
}