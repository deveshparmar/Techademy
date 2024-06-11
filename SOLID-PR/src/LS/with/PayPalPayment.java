package LS.with;

class PayPalPayment extends NonRefundablePayment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of Rs:" + amount);
    }
}
