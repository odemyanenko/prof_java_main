package homeworks.hw6_20230531.task8;

import java.util.Date;

public class Order {
  private final int id;
  private final String oNumber;
  private final Date oDate;
  private final Double amount;

  public Order(int id, String oNumber, Date oDate, Double amount) {
    this.id = id;
    this.oNumber = oNumber;
    this.oDate = oDate;
    this.amount = amount;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Order{" +
            "id=" + id +
            ", oNumber='" + oNumber + '\'' +
            ", oDate=" + oDate +
            ", amount=" + amount +
            '}';
  }
}
