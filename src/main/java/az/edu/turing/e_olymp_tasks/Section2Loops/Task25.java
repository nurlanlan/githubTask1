package az.edu.turing.e_olymp_tasks.Section2Loops;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextFloat();
        if(n/100<1 && n/100>0.1){
            System.out.println("Ok");
        }else System.out.println("No");
    }
}
