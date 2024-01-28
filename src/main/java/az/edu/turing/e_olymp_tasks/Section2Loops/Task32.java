package az.edu.turing.e_olymp_tasks.Section2Loops;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n%3==0 && n%2==0 && n/10>=1 && n/10<10){
            System.out.println("YES");

        }else System.out.println("NO");

    }
}
