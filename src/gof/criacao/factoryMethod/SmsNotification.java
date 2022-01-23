package gof.criacao.factoryMethod;

public class SmsNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Enviando uma nofiticação SMS");
    }
}
