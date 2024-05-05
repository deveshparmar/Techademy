public class PlaceOrderCommand implements OrderCommand{
    private Kitchen kitchen;
    private String order;

    public PlaceOrderCommand(Kitchen kitchen, String order) {
        this.kitchen = kitchen;
        this.order = order;
    }

    @Override
    public void execute() {
        kitchen.prepareOrder(order);
    }
}
