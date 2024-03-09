package az.edu.turing.Module1.PolimorphyismLast.Figures;

public class Triangle extends Shape {
    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double calculatePerimeter() {
        return side1 * side2 * side3;
    }
}
