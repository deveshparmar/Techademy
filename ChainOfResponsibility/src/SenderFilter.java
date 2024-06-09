package ChainOfResponsibility.src;

public class SenderFilter extends EmailFilter{
    @Override
    protected boolean canFilter(Email email) {
        return email.getSender().contains("@spam.com");
    }
}
