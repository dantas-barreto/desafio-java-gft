package gof.comportamental.iterator;

public class NotificationCollection implements Collection {

    static final int MAX_ITEMS = 6;

    int numberOfItems = 0;

    Notification[] notificationList;

    public  NotificationCollection() {
        notificationList = new Notification[MAX_ITEMS];

        addItem("Notificação 1");
        addItem("Notificação 2");
        addItem("Notificação 3");
    }

    public void addItem(String str) {
        Notification notification = new Notification(str);
        if (numberOfItems >= MAX_ITEMS) System.err.println("Full");
        else {
            notificationList[numberOfItems] = notification;
            numberOfItems++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }
}
