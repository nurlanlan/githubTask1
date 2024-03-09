package az.edu.turing.Module1.FigureLab;

public class Figure {
    boolean type;

    public Figure(boolean type) {
        this.type = type;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public void chooseType(){
        System.out.println("My type has choosen");

    }

}
