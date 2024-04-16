/*
 * Interface for notification having get and set method for notification
 */
public interface Notification {
    Notification clone();
    String getNotification();
    void setNotification(String notification);
}
