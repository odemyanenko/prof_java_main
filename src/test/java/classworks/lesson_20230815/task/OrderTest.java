package classworks.lesson_20230815.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.internal.matchers.Or;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OrderTest {
  private static LocalDateTime currentDateTime;
  private Order order;
  @Mock
  Person person;
  @Mock
  private Product product1;
  @Mock
  private Product product2;
  @Mock
  private Product product3;

  @BeforeEach
  void setUp() {
    currentDateTime = LocalDateTime.now();
    order = new Order(1, person, List.of(product1, product2, product3), currentDateTime.plusDays(2).toLocalDate());
  }

  @Test
  void calculateTotalPriceTest() {
    when(product1.getTotalPrice()).thenReturn(2.0);
    when(product2.getTotalPrice()).thenReturn(3.0);
    when(product3.getTotalPrice()).thenReturn(4.0);
    double excepted = 9;
    Assertions.assertEquals(excepted, order.calculateTotalPrice());
  }

  @Test
  void getNumberOfProductsTest() {
    when(product1.getQuantity()).thenReturn(2);
    when(product2.getQuantity()).thenReturn(3);
    when(product3.getQuantity()).thenReturn(0);
    int excepted = 5;
    Assertions.assertEquals(excepted, order.getNumberOfProducts());
  }

  @Test
  void isOrderExpiredTest() {
    Order orderExpired = new Order(2, person, List.of(product1), currentDateTime.plusDays(-2).toLocalDate());
    Assertions.assertFalse(order.isOrderExpired());
    Assertions.assertTrue(orderExpired.isOrderExpired());
  }
}