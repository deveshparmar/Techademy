/*
 * Driver code for Prototype pattern
 */
public class App {
    public static void main(String[] args) throws Exception {
        Notification whatsapp = new WhatsApp("Whatsapp notification");
        Notification telegram = new Telegram("Telegram notification");

        Notification cloneWhatsapp = whatsapp.clone();
        Notification cloneTelegram = telegram.clone();

        cloneTelegram.setNotification("new notification in telegram");
        cloneWhatsapp.setNotification("new notification in whatsapp");

        System.out.println(cloneTelegram.getNotification());
        System.out.println(cloneWhatsapp.getNotification());
    }
}
