import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<OrderCommand> orders = new ArrayList<>();

    public void takeOrder(OrderCommand order) {
        orders.add(order);
    }

    public void sendOrders() {
        for (OrderCommand order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
