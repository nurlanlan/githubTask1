package az.edu.turing.Module1.StatusApp;

import java.util.Scanner;

public class StatusApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter status:   Ready/Shipped/Rated");
        String status = scanner.nextLine();
        if (status == "Ready") {
            System.out.println("You can ship this package");
        } else if (status == "Shipped") {
            System.out.println("Rate our Store   Excellent/Bad");
            String rate = scanner.nextLine();
            if (rate == "Excellent") {
                System.out.println("Nice");
            } else if (rate == "Bad") {
                System.out.println("Sorry");
            }
        } else if (status == "Rated") {
            System.out.println("Thanks for rate us");
        }

    }
}
