package az.edu.turing.Module1.Lesson03;

public class CircleAppFront {
      public static void main(String[] args) {
        CircleApp circle1 = new CircleApp(5.0, "Red");
        CircleApp circle2 = new CircleApp(3.0, "Blue");

        System.out.println("Circle 1 Color: " + circle1.getColor());
        System.out.println("Circle 1 Length: " + circle1.calcLength());
        System.out.println("Circle 2 Color: " + circle2.getColor());
        System.out.println("Circle 2 Length: " + circle2.calcLength());

        circle1.setColor("Green");
        System.out.println("Circle 1 New Color: " + circle1.getColor());

        System.out.println("Total Circles: " + CircleApp.getCountOfCircles());
    }
}
