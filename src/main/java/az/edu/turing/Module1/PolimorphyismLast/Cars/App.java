package az.edu.turing.Module1.PolimorphyismLast.Cars;

public class App {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota") {
            @Override
            void start() {

            }

            @Override
            void stop() {

            }
        };
        Car car2 = new Sedan("Honda");
        Car car3 = new Truck("Ford");
        car1.start();
        car2.start();
        car3.start();

        car1.stop();
        car2.stop();
        car3.stop();

        // car3.loadCargo();
    }
}
