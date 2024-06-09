package ChainOfResponsibility.src;

public class AttachmentFilter extends EmailFilter{
    @Override
    protected boolean canFilter(Email email) {
        return email.isHasAttachment() && !email.getSender().equalsIgnoreCase("trusted@gmail.com");
    }
}
