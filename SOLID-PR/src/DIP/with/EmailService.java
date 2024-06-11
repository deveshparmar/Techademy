package DIP.with;

public class EmailService implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email with message: " + message);
    }
}
