package az.edu.turing.Module1.PolimorphyismLast.Cars;

abstract class Car {
    String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    abstract void start();
    abstract void stop();
}
