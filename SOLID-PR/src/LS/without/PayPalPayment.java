package LS.without;

public class PayPalPayment extends Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of Rs:" + amount);
    }

    @Override
    public void refundPayment(double amount) {
        throw new UnsupportedOperationException("PayPal payments cannot be refunded this way.");
    }
}
