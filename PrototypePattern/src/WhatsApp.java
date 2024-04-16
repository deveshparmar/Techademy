/*
 * Whatsapp class which implements notification for notification
 */

public class WhatsApp implements Notification {
    private String notification;

    public WhatsApp(String notification) {
        this.notification = notification;
    }

    public Notification clone() {
        return new WhatsApp(this.notification);
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }
}
