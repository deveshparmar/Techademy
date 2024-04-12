package withoutOpenClose;

public class App {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.processPayment("Cash", 1000);
        paymentProcessor.processPayment("UPI", 1500);

        // paymentProcessor.processPayment("CreditCard", 100);
        // paymentProcessor.processPayment("EMI", 2000);
    }
}
