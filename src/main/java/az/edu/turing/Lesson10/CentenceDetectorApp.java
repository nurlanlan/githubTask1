package az.edu.turing.Lesson10;

public class CentenceDetectorApp {
    public static void main(String[] args) {
        String centence = "Hello , i am using WhatsApp";
        System.out.println(centence.replace("Hello", "Hi"));
        System.out.println(centence.length());
        System.out.println(centence.toLowerCase());
        System.out.println(centence.indexOf("WhatsApp"));
        System.out.println(centence.toUpperCase());
        System.out.println(centence.trim());
    }
}
