package OpenClose.withoutOpenClose;

public class PaymentProcessor {
    
    public void processPayment(String paymentType, double amount){
        switch (paymentType) {
            case "Cash":
                System.out.println("Paying Rs " + amount + " in cash");  // pay by cash logic
                break;
            case "UPI":
                System.out.println("Paying Rs " + amount + " with UPI");  // pay by UPI logic
                break;
            case "CreditCard":
                System.out.println("Paying Rs " + amount + " with credit card");  // pay by Creditcard logic
                break;
            case "EMI":
                System.out.println("Paying Rs " + amount + " with EMI");  // pay by EMI logic
                break;
            default:
                break;
        }
    }
}
