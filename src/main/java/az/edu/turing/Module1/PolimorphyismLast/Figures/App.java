package az.edu.turing.Module1.PolimorphyismLast.Figures;

public class App {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        Shape triangle = new Triangle(2,3,4);
        System.out.println(circle.calculatePerimeter()+" "+square.calculatePerimeter()+" "+triangle.calculatePerimeter());
    }
}
