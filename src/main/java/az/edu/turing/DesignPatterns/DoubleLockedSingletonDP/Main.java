package az.edu.turing.DesignPatterns.DoubleLockedSingletonDP;

public class Main {
    public static void main(String[] args) {

        Logger logger1 = new Logger();
        Logger logger2 = new Logger();
        logger1.log("Hello world");
    }

}
