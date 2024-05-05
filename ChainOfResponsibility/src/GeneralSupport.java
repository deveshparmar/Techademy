public class GeneralSupport extends SupportTeam{
    @Override
    public void handleRequest(Ticket ticket) {
        System.out.println("General support team handling issue for " + ticket.getCustomerName());
    }
}
