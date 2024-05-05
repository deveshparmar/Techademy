public class TechnicalSupport extends SupportTeam{
    @Override
    public void handleRequest(Ticket ticket) {
        if (ticket.getPriority() <= 2) {
            System.out.println("Technical support team handling issue for " + ticket.getCustomerName());
        } else if (successor != null) {
            successor.handleRequest(ticket);
        }
    }
}
