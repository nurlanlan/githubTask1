package az.edu.turing.Module1.PolimorphyismLast.Figures;

public class Square extends Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculatePerimeter() {
        return 4* side;
    }
}
