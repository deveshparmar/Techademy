public class Email implements MessagingService{
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending Email message to " + recipient + ": " + message);
    }
}
