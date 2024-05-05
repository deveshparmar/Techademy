public class Account {
    public void checkBalance(long accountNumber) {
        System.out.println("Checking balance for account number: " + accountNumber);
    }

    public void deposit(long accountNumber, double amount) {
        System.out.println("Depositing " + amount + " into account number: " + accountNumber);
    }

    public void withdraw(long accountNumber, double amount) {
        System.out.println("Withdrawing " + amount + " from account number: " + accountNumber);
    }
}
