package OpenClose.withOpenClose;

public class CashPayment implements Payment{

    @Override
    public void processPayement(double amount) {
        System.out.println("Paying Rs " + amount + " in cash");

    }    
}
