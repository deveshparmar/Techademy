class PushNotificationSender implements INotificationSender {
    async sendNotification(message: string, recipient: string): Promise<boolean> {
        // Simulate an API call or interaction with a push notification service like Firebase
        console.log(`Sending push notification to ${recipient}: ${message}`);
        // Simulating a successful push notification send with a promise
        return Promise.resolve(true);  // Simulate success
    }
}