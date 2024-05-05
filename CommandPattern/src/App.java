public class App {
    public static void main(String[] args) {
        // Create receiver
        Kitchen kitchen = new Kitchen();

        // Create invoker
        Waiter waiter = new Waiter();

        // Create commands
        OrderCommand order1 = new PlaceOrderCommand(kitchen, "Pizza");
        OrderCommand order2 = new PlaceOrderCommand(kitchen, "Burger");
        OrderCommand order3 = new PlaceOrderCommand(kitchen, "Salad");

        // Place orders
        waiter.takeOrder(order1);
        waiter.takeOrder(order2);
        waiter.takeOrder(order3);

        // Send orders to kitchen
        waiter.sendOrders();
    }
}
