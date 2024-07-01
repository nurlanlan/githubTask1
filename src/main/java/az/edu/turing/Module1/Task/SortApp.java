package az.edu.turing.Module1.Task;
import java.util.Arrays;
import java.util.Random;

public class SortApp {


    public static void main(String[] args) {
        Random random = new Random();
        int length = random.nextInt(10) + 1;
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100);
        }
        Arrays.sort(array);

        System.out.println("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }


}
