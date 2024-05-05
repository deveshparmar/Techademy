public class App {
    public static void main(String[] args) {
        SupportTeam technicalSupport = new TechnicalSupport();
        SupportTeam billingSupport = new BillingSupport();
        SupportTeam generalSupport = new GeneralSupport();

        technicalSupport.setSuccessor(billingSupport);
        billingSupport.setSuccessor(generalSupport);

        Ticket ticket1 = new Ticket("John Doe", "Need help with software installation", 1);
        Ticket ticket2 = new Ticket("Jane Smith", "Billing issue - payment not processed", 3);
        Ticket ticket3 = new Ticket("Alice Johnson", "General question about product features", 2);

        technicalSupport.handleRequest(ticket1);
        technicalSupport.handleRequest(ticket2);
        technicalSupport.handleRequest(ticket3);
    }
}
