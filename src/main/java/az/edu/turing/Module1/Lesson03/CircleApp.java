package az.edu.turing.Module1.Lesson03;

public class CircleApp {
    private double radius;
    private String color;
    public static long countOfCircles = 0;

    public CircleApp(double radius, String color) {
        this.radius = radius;
        this.color = color;
        countOfCircles++;
    }

    public double calcLength() {
        return 2 * Math.PI * radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static long getCountOfCircles() {
        return countOfCircles;
    }


}
