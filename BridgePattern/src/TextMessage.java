public class TextMessage extends Message{

    public TextMessage(MessagingService messagingService) {
        super(messagingService);
    }
    @Override
    public void send(String message, String recipient) {
        messagingService.sendMessage(message, recipient);
    }
}
