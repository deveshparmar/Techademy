package SRP.without;

public class InvoiceGenerator {
    public Invoice generateInvoice(Order order) {
        int orderId = order.getOrderId();
        String product = order.getProduct();
        int quantity = order.getQuantity();
        double pricePerUnit = order.getPrice();
        double total = order.calculateTotal();

        return new Invoice(orderId, product, quantity, pricePerUnit, total);
    }
}
