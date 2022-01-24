import gof.criacao.abstractFactory.CarFactory;
import gof.criacao.abstractFactory.CarType;
import gof.criacao.abstractFactory.Location;
import gof.criacao.builder.User;
import gof.criacao.factoryMethod.Notification;
import gof.criacao.factoryMethod.NotificationFactory;
import gof.criacao.prototype.ColorStore;
import gof.criacao.singleton.Singleton1;
import gof.criacao.singleton.Singleton2;
import gof.criacao.singleton.Singleton3;
import gof.criacao.singleton.Singleton4;
import gof.estrutural.Flyweight.CounterStrike;
import gof.estrutural.Flyweight.Player;
import gof.estrutural.Flyweight.PlayerFactory;
import gof.estrutural.adapter.BirdAdapter;
import gof.estrutural.adapter.PlasticToyDuck;
import gof.estrutural.adapter.Sparrow;
import gof.estrutural.adapter.ToyDuck;
import gof.estrutural.bridge.*;
import gof.estrutural.composite.CompanyDirectory;
import gof.estrutural.composite.Developer;
import gof.estrutural.composite.Manager;
import gof.estrutural.decorator.Circle;
import gof.estrutural.decorator.Rectangle;
import gof.estrutural.decorator.RedShapeDecorator;
import gof.estrutural.decorator.Shape;
import gof.estrutural.facade.Both;
import gof.estrutural.facade.HotelKeeper;
import gof.estrutural.facade.NonVegMenu;
import gof.estrutural.facade.VegMenu;
import gof.estrutural.proxy.Internet;
import gof.estrutural.proxy.ProxyInternet;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Início dos Padrões de Projeto de Criação ===");

        System.out.println();

        // Factory Method
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification sms = notificationFactory.createNotification("SMS");
        Notification email = notificationFactory.createNotification("EMAIL");
        Notification push = notificationFactory.createNotification("PUSH");
        sms.notifyUser();
        email.notifyUser();
        push.notifyUser();

        System.out.println();

        // Abstract Factory
        System.out.println(CarFactory.buildCar(CarType.LUXURY, Location.DEFAULT));
        System.out.println(CarFactory.buildCar(CarType.MICRO, Location.INDIA));
        System.out.println(CarFactory.buildCar(CarType.MINI, Location.USA));

        System.out.println();

        // Singleton
        System.out.println(Singleton1.getInstance().toString());
        System.out.println(Singleton2.getInstance().toString());
        System.out.println(Singleton3.getInstance().toString());
        System.out.println(Singleton4.getInstance().toString());

        System.out.println();

        // Builder
        User user1 = new User.Builder("João", "Lourenço")
                .age(30)
                .phone("(99) 99999-9999")
                .address("Endereço falso 1234")
                .build();

        User user2 = new User.Builder("Mateus", "Botelho")
                .age(45)
                .build();

        System.out.println(user1);
        System.out.println(user2);

        System.out.println();

        // Prototype
        ColorStore.getColor("blue").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("blue").addColor();

        System.out.println();

        System.out.println("==== Início dos Padrões de Projeto Estruturais ===");

        System.out.println();

        // Adapter
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck...");
        toyDuck.squeak();

        System.out.println("BirdAdapter...");
        birdAdapter.squeak();

        System.out.println();

        // Bridge
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufacture();
        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();

        System.out.println();

        // Composite
        Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer");
        Developer dev2 = new Developer(101, "Vinay Sharma", "Developer");
        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Manager man1 = new Manager(200, "Kushagra Garg", "SEO Manager");
        Manager man2 = new Manager(201, "Vikram Sharma ", "Kushagra's Manager");

        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();

        System.out.println();

        // Decorator
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle with red border");
        redCircle.draw();

        System.out.println("\nRectangle with red border");
        redRectangle.draw();

        System.out.println();

        // Facade
        HotelKeeper keeper = new HotelKeeper();

        VegMenu v = keeper.getVegMenu();
        NonVegMenu nv = keeper.getNonVegMenu();
        Both b = keeper.getVegNonMenu();

        System.out.println();

        // Flyweight
        for (int i = 0; i < 10; i++) {
            Player p = PlayerFactory.getPlayer(CounterStrike.getRandPlayerType());
            p.assignWearpon(CounterStrike.getRandWearpon());
            p.mission();
        }

        System.out.println();

        // Proxy
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("youtube.com");
            internet.connectTo("abc.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
    }
}
