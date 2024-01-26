package az.edu.turing.e_olymp_tasks.Section2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a<b){
            System.out.println(a+" "+b);
        }else System.out.println(b+" "+a);
    }
}
