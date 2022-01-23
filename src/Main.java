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
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

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
    }
}
