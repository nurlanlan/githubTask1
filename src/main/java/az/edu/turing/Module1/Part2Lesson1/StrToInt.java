package az.edu.turing.Module1.Part2Lesson1;

import java.util.Scanner;

public class StrToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first digit: ");
        String number1 = scanner.nextLine();
        System.out.print("Enter second digit: ");
        String number2 = scanner.nextLine();
        int numberInt1 = Integer.parseInt(number1);
        int numberInt2 = Integer.parseInt(number2);
        int result = numberInt1 / numberInt2;
        System.out.println("Result: "+result);
    }
}
