// Interface for sending notifications
interface INotificationSender {
    sendNotification(message: string, recipient: string): Promise<boolean>;
}