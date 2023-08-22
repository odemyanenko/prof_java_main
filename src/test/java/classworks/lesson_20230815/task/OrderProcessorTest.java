package classworks.lesson_20230815.task;

import classworks.lesson_20230815.task.exceptions.OrderExistsException;
import classworks.lesson_20230815.task.exceptions.OrderIsNullException;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.Assert.*;

@ExtendWith(MockitoExtension.class)
public class OrderProcessorTest {

  @InjectMocks
  OrderProcessor orderProcessor;

  @Spy
  List<Order> ordersMock;

  @Mock
  Order order;

  @BeforeEach
  void setUp(){

  }

  @AfterEach
  void tearDown(){
    
  }

  @Test
  void addOrderNullWithExceptionTest() {
    Assertions.assertThrows(OrderIsNullException.class, () -> orderProcessor.addOrder(null));
  }

  @Test
  void addOrderExistsWithExceptionTest() {
    Assertions.assertThrows(OrderExistsException.class, () -> orderProcessor.addOrder(null));
  }

  @Test
  void addOrderTest() {

  }

  @Test
  void calculateTotalRevenueTest() {
  }

  @Test
  void getExpiredOrdersTest() {
  }
}

/*
	@Spy
	List<String> listSpy = new ArrayList<>();

	@Test
	public void testSpyReturnsRealValues() {
		String str = "Test Spy";

		listSpy.add(str);

		verify(listSpy).add(str);
		assertEquals(1, listSpy.size());
	}
* */