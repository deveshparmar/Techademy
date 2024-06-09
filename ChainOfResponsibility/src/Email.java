package ChainOfResponsibility.src;

public class Email {
    private String sender;
    private String subject;
    private String content;
    private boolean hasAttachment;

    public Email(String sender, String subject, String content, boolean hasAttachment) {
        this.sender = sender;
        this.subject = subject;
        this.content = content;
        this.hasAttachment = hasAttachment;
    }

    public String getSender() {
        return sender;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public boolean isHasAttachment() {
        return hasAttachment;
    }
}
