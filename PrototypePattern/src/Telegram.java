/*
 * Telegram class which implements notification for notification
 */
public class Telegram implements Notification {

    private String notification;

    public Telegram(String notification) {
        this.notification = notification;
    }

    public Notification clone() {
        return new Telegram(this.notification);
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }
}
