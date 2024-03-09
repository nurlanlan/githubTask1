package az.edu.turing.Module1.PolimorphyismLast.Cars;

public class Truck extends Car{
    public Truck(String brand) {
        super(brand);
    }
    void start(){
        System.out.println(brand + " Truck started");
    }

    @Override
    void stop() {
        System.out.println(brand + " Truck car started");
    }

    void loadCargo(){
        System.out.println(brand+" Truck loading cargo");
    }
}
