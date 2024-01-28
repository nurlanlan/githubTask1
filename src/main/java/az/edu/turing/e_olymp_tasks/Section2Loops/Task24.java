package az.edu.turing.e_olymp_tasks.Section2Loops;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextInt();
        if(n/10<1){
            System.out.println("ok");
        }else System.out.println("NO");
    }
}
