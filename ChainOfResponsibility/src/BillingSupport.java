public class BillingSupport extends SupportTeam{
    @Override
    public void handleRequest(Ticket ticket) {
        if (ticket.getIssueDescription().toLowerCase().contains("billing")) {
            System.out.println("Billing support team handling issue for " + ticket.getCustomerName());
        } else if (successor != null) {
            successor.handleRequest(ticket);
        }
    }
}
