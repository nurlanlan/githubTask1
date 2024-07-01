package az.edu.turing.Module1.FileApp;
import java.io.File;
import java.io.IOException;

public class StudentApp {
    public class Main {
        public static void main(String[] args) {

            String filePath = "example.txt";

            try {

                File file = new File("src/main/java/az/edu/turingModule1/FileApp");


                if (file.exists()) {
                    System.out.println("File already exists.");
                } else {

                    if (file.createNewFile()) {
                        System.out.println("File created: " + file.getName());
                    } else {
                        System.out.println("Failed to create file.");
                    }
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

}
