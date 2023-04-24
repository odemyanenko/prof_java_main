package classworks.lesson12_20230424.restoranOrder;

import java.util.Objects;

public class Order {
  private int id;
  private String dishName;
  private int portionCount;
  private double cost;

  public Order(int id, String dishName, int portionCount, double cost) {
    this.id = id;
    this.dishName = dishName;
    this.portionCount = portionCount;
    this.cost = cost;
  }

  public int getId() {
    return id;
  }

  public String getDishName() {
    return dishName;
  }

  public int getPortionCount() {
    return portionCount;
  }

  public double getCost() {
    return cost;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Order order)) return false;
    return id == order.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "Order{" +
            "id=" + id +
            ", dishName='" + dishName + '\'' +
            ", portionCount=" + portionCount +
            ", cost=" + cost +
            '}';
  }

  public double totalCostOrder(){
    return 0;
  }
}
