package az.edu.turing.e_olymp_tasks.Section4Rewind;

import java.util.Scanner;

public class TaskI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long money = 0;
        int N = 0;
        long S = scanner.nextLong();
        while (money < S) {
            N++;
            money = money * 2 + N;
        }
        System.out.println(N - 1);
    }
}