package az.edu.turing.lesson06;

import java.util.Scanner;

public class IdentifyMonthByNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of month");
        int NumbeOfMonth = scanner.nextInt();
        if(NumbeOfMonth==1){
            System.out.println("January");
        } else if (NumbeOfMonth ==2) {
            System.out.println("Feburary");
        }else if (NumbeOfMonth ==2) {
            System.out.println("March");
        }else if (NumbeOfMonth ==2) {
            System.out.println("April");
        }else if (NumbeOfMonth ==2) {
            System.out.println("May");
        }else if (NumbeOfMonth ==2) {
            System.out.println("June");
        }else if (NumbeOfMonth ==2) {
            System.out.println("July");
        }else if (NumbeOfMonth ==2) {
            System.out.println("August");
        }else if (NumbeOfMonth ==2) {
            System.out.println("September");
        }else if (NumbeOfMonth ==2) {
            System.out.println("October");
        }else if (NumbeOfMonth ==2) {
            System.out.println("Novemver");
        }else System.out.println("December");
    }
}
