package az.edu.turing.Module1.Quiz6Rewind.Q3;

public class Mercedes extends Car {
    private String model;

    public Mercedes(String model, String color) {
        super(color);
        this.model = model;
    }

    public String toString() {
        return "Model ; " + model + " , " + super.toString();
    }
}
