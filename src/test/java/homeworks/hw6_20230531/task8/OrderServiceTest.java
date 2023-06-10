package homeworks.hw6_20230531.task8;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class OrderServiceTest {
  private OrderDB db;
  private OrderService service;

  @Before
  public void setUp() {
    db = mock(OrderDB.class);
    service = new OrderService(db);
  }

  @Test
  public void placeOrder() {
    Order order = mock(Order.class);

    service.placeOrder(order);
    verify(db).save(order);
  }
}