package gof.criacao.factoryMethod;

public class NotificationFactory {

    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty()) return null;
        if ("SMS".equals(channel)) {
            return new SmsNotification();
        } else if ("EMAIL".equals(channel)) {
            return new EmailNotification();
        } else if ("PUSH".equals(channel)) {
            return new PushNotification();
        }
        return null;
    }
}
