package az.edu.turing.Module1.SeatApp;
import java.util.Random;

public class SeatApp {
    public static void main(String[] args) {
        String[] array = {"Nurlan", "Aydan", "Selen", "Kenan", "Ilham", "FeridKorea", "Nezrin", "Aybeniz", "Vusal", "FeridAgKoynek", "Ismail", "Behruz", "Leyla", "Eli", "Eldar", "Besir", "Osman"};
        Random random = new Random();

        int index1 = random.nextInt(array.length);
        int index2 = random.nextInt(array.length);

        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + "." + array[i]);
            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
    }
}

