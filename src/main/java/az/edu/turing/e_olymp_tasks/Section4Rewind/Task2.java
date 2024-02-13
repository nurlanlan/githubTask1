package az.edu.turing.e_olymp_tasks.Section4Rewind;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (Math.sqrt(n)%1==0){
            System.out.println((int)Math.sqrt(n));
        }else System.out.println("NO");
    }
}
