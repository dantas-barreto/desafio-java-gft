package gof.criacao.factoryMethod;

public class PushNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Enviando uma notificação Push");
    }
}
