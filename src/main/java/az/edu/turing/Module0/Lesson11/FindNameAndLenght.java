package az.edu.turing.Module0.Lesson11;

import java.util.Scanner;

public class FindNameAndLenght {
    public static void main(String[] args) {

    }
    public static String extractName(String email) {
        Scanner scanner = new Scanner(System.in);
        String emailAddress = scanner.nextLine();
        String[] parts = emailAddress.split("@");
        String name = parts[0];
        return name;

    }


}

