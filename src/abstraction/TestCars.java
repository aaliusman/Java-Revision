package abstraction;

public class TestCars {

    public static void main(String[] args) {


        Cars car = new Audi();
        technology tech = new Audi();
        car.automatic();
        car.door(4);
        car.engine();
        car.engine();
        car.seats();
        tech.bluetooth();
        tech.keyless();

    }
}
