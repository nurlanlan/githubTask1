package az.edu.turing.lesson08;

import java.util.Scanner;

public class DivisorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number  = scanner.nextInt();
        for (int i = 1; i <=number ; i++) {
            if (number%i==0 && i%2==1){ //tek bolenler
                System.out.print(i+ " ");
            }
        }
        for (int i = 1; i <=number ; i++) {
            if (number%i==0 && i%2==0){ //cut bolenler
                System.out.print(i+ " ");
            }
        }
        for (int i = 1; i <=number ; i++) {
            if (number%i==0 ){ //butun bolenler
                System.out.print(i+ " ");
            }
        }

    }
}
