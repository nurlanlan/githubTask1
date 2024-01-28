package az.edu.turing.e_olymp_tasks.Section3Arrays;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 10 && number <= 99) {
            int FirstDigit = number/10;
            int SecondDigit = number%10;
            int cem = FirstDigit + SecondDigit;
            System.out.println((int)Math.pow(cem,2));
        }else System.out.println("Enter valid value");
    }
}
