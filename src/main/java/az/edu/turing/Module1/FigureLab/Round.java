package az.edu.turing.Module1.FigureLab;

public class Round {
    String color;
    double diametr;
    double raidus;

    public double FindArea() {
        return Math.PI * Math.pow(raidus, 2);
    }

    public double FindLength() {
        return Math.PI * 2 * raidus;
    }
}
