public class BankingFacade {
    private Account accounts;
    private Transactions transactions;
    private Loans loans;
    private CustomerInfo customerInformation;

    public BankingFacade() {
        accounts = new Account();
        transactions = new Transactions();
        loans = new Loans();
        customerInformation = new CustomerInfo();
    }

    public void deposit(long accountNumber, double amount) {
        accounts.deposit(accountNumber, amount);
    }

    public void withdraw(long accountNumber, double amount) {
        accounts.withdraw(accountNumber, amount);
    }

    public void transfer(long fromAccount, long toAccount, double amount) {
        transactions.transfer(fromAccount, toAccount, amount);
    }

    public void applyForLoan(long customerID, double amount) {
        loans.applyForLoan(customerID, amount);
    }

    public void checkBalance(long accountNumber) {
        accounts.checkBalance(accountNumber);
    }

    public void getCustomerDetails(long customerID) {
        customerInformation.getCustomerDetails(customerID);
    }
}
