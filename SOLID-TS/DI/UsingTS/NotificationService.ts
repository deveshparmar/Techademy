class NotificationService {
    private notificationSender: INotificationSender;

    // Constructor injects the correct notification sender
    constructor(notificationSender: INotificationSender) {
        this.notificationSender = notificationSender;
    }

    // Method to notify a recipient
    async notify(message: string, recipient: string): Promise<void> {
        try {
            const success = await this.notificationSender.sendNotification(message, recipient);
            if (success) {
                console.log('Notification sent successfully!');
            } else {
                console.log('Failed to send notification');
            }
        } catch (error) {
            console.error('Error sending notification:', error);
        }
    }
}