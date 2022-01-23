package gof.criacao.factoryMethod;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Enviando uma notificação de Email");
    }
}
