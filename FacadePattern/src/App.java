public class App {
    public static void main(String[] args) {
        BankingFacade facade = new BankingFacade();

        // Deposit money into account
        facade.deposit(123456789, 1000);

        // Withdraw money from account
        facade.withdraw(123456789, 500);

        // Transfer money between accounts
        facade.transfer(123456789, 987654321, 200);

        // Apply for a loan
        facade.applyForLoan(123456, 5000);

        // Check account balance
        facade.checkBalance(123456789);

        // Get customer details
        facade.getCustomerDetails(123456);
    }
}
