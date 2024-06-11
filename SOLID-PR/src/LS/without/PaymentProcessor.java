package LS.without;

public class PaymentProcessor {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        Payment payPalPayment = new PayPalPayment();

        processPayment(creditCardPayment, 100.0);
        processPayment(payPalPayment, 200.0);

        processRefund(creditCardPayment, 50.0);
        try {
            processRefund(payPalPayment, 50.0);  // This will throw an exception
        } catch (UnsupportedOperationException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void processPayment(Payment payment, double amount) {
        payment.processPayment(amount);
    }

    public static void processRefund(Payment payment, double amount) {
        payment.refundPayment(amount);
    }
}

