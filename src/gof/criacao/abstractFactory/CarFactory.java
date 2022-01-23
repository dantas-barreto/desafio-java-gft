package gof.criacao.abstractFactory;

public class CarFactory {

    private CarFactory() {
    }

    public static Car buildCar(CarType type, Location location) {
        Car car = null;

        if (location.equals("INDIA"))
            location = Location.INDIA;
        if (location.equals("USA"))
            location = Location.USA;
        if (location.equals("DEFAULT"))
            location = Location.DEFAULT;

        switch (location) {
            case USA:
                car = UsaCarFactory.buildCar(type);
                break;

            case INDIA:
                car = IndiaCarFactory.buildCar(type);
                break;

            default:
                car = DefaultCarFactory.buildCar(type);
        }
        return car;
    }
}
