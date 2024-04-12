package withOpenClose;

public class App {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayement(new CashPayment(), 1000);
        processor.processPayement(new UpiPayment(), 1500);
        
        processor.processPayement(new EmiPayment(), 1200);
        processor.processPayement(new CreditCardPayment(), 1000);
    }
}
