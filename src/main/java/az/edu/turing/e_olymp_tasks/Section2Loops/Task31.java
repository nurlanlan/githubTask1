package az.edu.turing.e_olymp_tasks.Section2Loops;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n%2==1 || n>0 && n/100>=1){
            System.out.println("YES");

        }else System.out.println("NO");

    }
}
