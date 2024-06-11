package DIP.with;

public class SMSService implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}
