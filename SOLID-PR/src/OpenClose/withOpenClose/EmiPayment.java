package OpenClose.withOpenClose;

public class EmiPayment implements Payment {

    @Override
    public void processPayement(double amount) {
        System.out.println("Paying Rs " + amount + " with EMI");
    }

}
