package az.edu.turing.lesson06;

import java.util.Scanner;

public class MathMethods1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first digit of operation : ");
        int a = scanner.nextInt();
        System.out.print("Enter the second digit of operation : ");
        int b = scanner.nextInt();
        System.out.println("Result: "+a % b);
    }
}
