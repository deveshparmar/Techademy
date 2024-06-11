package DIP.without;

public class NotificationApp {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("Hello, this is a notification!");
    }
}
