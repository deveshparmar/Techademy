package LS.without;

public abstract class Payment {
    public abstract void processPayment(double amount);
    public abstract void refundPayment(double amount);  // This method may cause issues for certain payment methods
}
