package DIP.with;

public class NotificationApp {
    public static void main(String[] args) {
        NotificationService emailService = new EmailService();
        NotificationService smsService = new SMSService();

        NotificationManager emailNotificationManager = new NotificationManager(emailService);
        NotificationManager smsNotificationManager = new NotificationManager(smsService);

        emailNotificationManager.sendNotification("Hello, this is an email notification!");
        smsNotificationManager.sendNotification("Hello, this is an SMS notification!");
    }
}
