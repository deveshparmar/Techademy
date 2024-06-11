package OpenClose.withOpenClose;

public class CreditCardPayment implements Payment{

    @Override
    public void processPayement(double amount) {
        System.out.println("Paying Rs " + amount + " with credit card");
    }
    
}
