package ChainOfResponsibility.src;

public abstract class EmailFilter {
    protected EmailFilter nextFilter;

    public void setNextFilter(EmailFilter nextFilter) {
        this.nextFilter = nextFilter;
    }
    public void filterEmail(Email email) {
        if (canFilter(email)) {
            System.out.println(this.getClass().getSimpleName() + " identified the email as spam.");
        } else if (nextFilter != null) {
            nextFilter.filterEmail(email);
        } else {
            System.out.println("Email passed all filters and is not spam.");
        }
    }

    protected abstract boolean canFilter(Email email);
}
