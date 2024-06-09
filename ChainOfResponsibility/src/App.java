package ChainOfResponsibility.src;

public class App {
    public static void main(String[] args) {
        // Create filters
        EmailFilter senderFilter = new SenderFilter();
        EmailFilter keywordFilter = new KeywordFilter();
        EmailFilter attachmentFilter = new AttachmentFilter();

        // Set up the chain
        senderFilter.setNextFilter(keywordFilter);
        keywordFilter.setNextFilter(attachmentFilter);

        // Create emails
        Email email1 = new Email("hello@spam.com", "Win Money Now!", "You have won a lottery", false);
        Email email2 = new Email("hello@gmail.com", "Hi", "Get loan of rs 100000", true);
        Email email3 = new Email("hello@gmail.com", "Daily News", "Top stories of the day", false);
        Email email4 = new Email("trusted@gmail.com", "Important Document", "Please see the attachment", true);

        // Process emails
        System.out.println("Processing email1:");
        senderFilter.filterEmail(email1);

        System.out.println("\nProcessing email2:");
        senderFilter.filterEmail(email2);

        System.out.println("\nProcessing email3:");
        senderFilter.filterEmail(email3);

        System.out.println("\nProcessing email4:");
        senderFilter.filterEmail(email4);
    }
}
