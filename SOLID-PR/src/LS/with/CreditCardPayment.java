package LS.with;

public class CreditCardPayment extends RefundablePayment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of Rs:" + amount);
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding credit card payment of Rs:" + amount);
    }
}
