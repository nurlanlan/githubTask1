package az.edu.turing.Module1.PolimorphyismLast.Cars;

public class Sedan extends Car{
    public Sedan(String brand) {
        super(brand);
    }
    void start(){
        System.out.println(brand + " sedan car started");
    }

    @Override
    void stop() {
        System.out.println(brand + " sedan car started");
    }
}
