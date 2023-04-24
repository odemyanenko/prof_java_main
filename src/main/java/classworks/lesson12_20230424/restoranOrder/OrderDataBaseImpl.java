package classworks.lesson12_20230424.restoranOrder;

import java.util.LinkedList;
import java.util.List;

public class OrderDataBaseImpl implements OrdersDataBase {
  List<Order> orders = new LinkedList<>();

  @Override
  public void addOrder(Order order) {
    orders.add(order);
  }

  @Override
  public boolean removeOrder(Order order) {
    return orders.remove(order);
  }

  @Override
  public double getTotalCost() {
    double total = 0;
    for (Order order: orders
         ) {
      total += order.getCost() * order.getPortionCount();
    }
    return total;
  }

  @Override
  public int getOrdersCount() {
    return orders.size();
  }

  @Override
  public Order getOrderById(int id) {
    for (int i = 0; i < orders.size(); i++) {
      if (orders.get(i).getId() == id) {
        return orders.get(i);
      }
    }
    return null;
  }

  @Override
  public void printOrders() {
    System.out.println(orders.toString());
  }
}
