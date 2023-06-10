package homeworks.hw6_20230531.task8;

public class OrderService {
  private final OrderDB db;

  public OrderService(OrderDB db) {
    this.db = db;
  }

  public void placeOrder(Order order) {
    db.save(order);
  }
}
