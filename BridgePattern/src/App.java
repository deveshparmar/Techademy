public class App {
    public static void main(String[] args) {
        MessagingService sms = new SMS();
        Message textMessage = new TextMessage(sms);
        textMessage.send("Hello there!","+9111183833");

        MessagingService email = new Email();
        Message multimediaMessage = new MultiMediaMessage(email);
        multimediaMessage.send("Check this photo","dp@gmail.com");

        MessagingService whatsapp= new WhatsApp();
        Message whatsAppMessage = new TextMessage(whatsapp);
        whatsAppMessage.send("New msg","James Anderson");
    }
}
