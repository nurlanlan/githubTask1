package az.edu.turing.Module1.Quiz6Rewind.Q6;

public class App {
    public static void main(String[] args) {
        Animal animal1 = new Bird();
        Animal animal2 = new Penguin();
        Bird bird = new Penguin();
        animal1.move();
        animal2.move();
        bird.move();
    }
}
