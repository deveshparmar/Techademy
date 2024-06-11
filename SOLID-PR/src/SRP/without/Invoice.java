package SRP.without;

public class Invoice {
    private int orderId;
    private String product;
    private int quantity;
    private double pricePerUnit;
    private double total;

    public Invoice(int orderId, String product, int quantity, double pricePerUnit, double total) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Invoice for Order ID: " + orderId + "\n" +
                "Product: " + product + "\n" +
                "Quantity: " + quantity + "\n" +
                "Price per unit: " + pricePerUnit + "\n" +
                "Total: " + total;
    }
}
