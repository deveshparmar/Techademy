class EmailNotificationSender implements INotificationSender {
    async sendNotification(message: string, recipient: string): Promise<boolean> {
        // Simulate an API call or interaction with an email service provider like SendGrid
        console.log(`Sending email to ${recipient}: ${message}`);
        // Simulating a successful email send with a promise
        return Promise.resolve(true);  // Simulate success
    }
}
