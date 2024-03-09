package az.edu.turing.Module1.FigureLab;

public class Rectangle {
    double width;
    double length;

    public double FindArea(){
    return width*length;
    }

    public double FindLength(){
        return 2*(width+length);
    }

    public  double FindDioganal(){
        return Math.sqrt(Math.pow(width,2)+ Math.pow(length,2));
    }
}
