package az.edu.turing.Module1.Lesson03;

public class Square {
    private String color;
    private double side;
    public static long countOfSquares;

    public Square(double side) {
        this.side = side;
        countOfSquares++;
    }

    public double calcLenght() {
        return (side + side) * 2;
    }

    public double calcArea() {
        return side * side;
    }

    public String getColor() {
        return color;
    }

    public double getSide() {
        return side;
    }

    public void setColor(String color) {
        if (!"White".equals(color))
            this.color = color;
    }
}
