package withOpenClose;

public class UpiPayment implements Payment{

    @Override
    public void processPayement(double amount) {
        System.out.println("Paying Rs " + amount + " with UPI");
    }
    
}
