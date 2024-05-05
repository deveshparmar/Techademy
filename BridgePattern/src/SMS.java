public class SMS implements MessagingService{
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending SMS message to " + recipient + ": " + message);
    }
}
