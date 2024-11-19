async function sendUserNotifications() {
    // Injecting Email Notification sender
    const emailService = new NotificationService(new EmailNotificationSender());
    await emailService.notify("Sample Mail!", "abc@gmail.com");

    // Injecting SMS Notification sender
    const smsService = new NotificationService(new SMSNotificationSender());
    await smsService.notify("Your OTP is 123456", "+91-8989898989");

    // Injecting Push Notification sender
    const pushService = new NotificationService(new PushNotificationSender());
    await pushService.notify("You have a new message!", "abc123");
}

// Call the example function
sendUserNotifications().catch((error) => console.error(error));