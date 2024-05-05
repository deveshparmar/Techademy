public abstract class Message {
    protected MessagingService messagingService;

    public Message(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

    public abstract void send(String message, String recipient);
}
