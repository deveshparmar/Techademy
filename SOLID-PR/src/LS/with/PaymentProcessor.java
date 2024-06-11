package LS.with;

public class PaymentProcessor {
    public static void main(String[] args) {
        RefundablePayment creditCardPayment = new CreditCardPayment();
        Payment payPalPayment = new PayPalPayment();

        processPayment(creditCardPayment, 100.0);
        processPayment(payPalPayment, 200.0);

        processRefund(creditCardPayment, 50.0);
        // processRefund((RefundablePayment) payPalPayment, 50.0);  // This will not compile, preventing potential runtime errors
    }

    public static void processPayment(Payment payment, double amount) {
        payment.processPayment(amount);
    }

    public static void processRefund(RefundablePayment payment, double amount) {
        payment.refundPayment(amount);
    }
}
