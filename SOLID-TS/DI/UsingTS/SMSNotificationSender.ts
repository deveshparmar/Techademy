class SMSNotificationSender implements INotificationSender {
    async sendNotification(message: string, recipient: string): Promise<boolean> {
        // Simulate an API call or interaction with an SMS service provider like Twilio
        console.log(`Sending SMS to ${recipient}: ${message}`);
        // Simulating a successful SMS send with a promise
        return Promise.resolve(true);  // Simulate success
    }
}