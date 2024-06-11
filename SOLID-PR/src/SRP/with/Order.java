package SRP.with;

class Order {
    private int orderId;
    private String product;
    private int quantity;
    private double price;

    public Order(int orderId, String product, int quantity, double price) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double calculateTotal() {
        return quantity * price;
    }

    public void generateInvoice() {
        System.out.println("Invoice for with.Order ID: " + orderId);
        System.out.println("Product: " + product);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per unit: " + price);
        System.out.println("Total: " + calculateTotal());
    }
}
