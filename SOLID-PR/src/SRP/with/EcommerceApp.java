package SRP.with;

public class EcommerceApp {
    public static void main(String[] args) {
        Order order = new Order(1,"Mobile",1,10000);
        order.generateInvoice();
    }
}
