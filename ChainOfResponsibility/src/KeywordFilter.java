package ChainOfResponsibility.src;

public class KeywordFilter extends EmailFilter{
    @Override
    protected boolean canFilter(Email email) {
        return email.getSubject().toLowerCase().contains("lottery");
    }
}
