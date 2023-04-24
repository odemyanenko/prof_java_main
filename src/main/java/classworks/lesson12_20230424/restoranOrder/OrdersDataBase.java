package classworks.lesson12_20230424.restoranOrder;

public interface OrdersDataBase {
  public void addOrder(Order order);
  public boolean removeOrder(Order order);
  public double getTotalCost();
  public int getOrdersCount();
  public Order getOrderById(int id);
  public void  printOrders();
}
