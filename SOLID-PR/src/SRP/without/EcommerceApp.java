package SRP.without;

public class EcommerceApp {
    public static void main(String[] args) {
    Order order = new Order(1, "Mobile", 1, 10000);
    InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

    Invoice invoice = invoiceGenerator.generateInvoice(order);
    System.out.println(invoice);
    }
}
