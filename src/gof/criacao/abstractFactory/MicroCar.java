package gof.criacao.abstractFactory;

public class MicroCar extends Car {

    MicroCar(Location location) {
        super(CarType.MICRO, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Connecting to micro car");
    }
}