package homeworks.hw6_20230531.task7;

import org.junit.Test;
import java.util.HashMap;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class CustomerServiceTest {
  private CustomerService service;
  private HashMap<Integer, Customer> customers = new HashMap<>();

  @Test
  public void getCustomerById() {
    int customerId = 1;
    String customerName = "customer1";

    Customer customer = new Customer(customerId, customerName);
    Customer mockCustomer1 = mock(Customer.class);
    Customer mockCustomer2 = mock(Customer.class);

    customers = new HashMap<>();
    customers.put(customerId, customer);
    customers.put(2, mockCustomer1);
    customers.put(3, mockCustomer2);

    service = new CustomerService(customers);

    Customer actualCustomer = service.getCustomerById(customerId);

    assertNotNull(actualCustomer);
    assertEquals(1, actualCustomer.getId());
    assertEquals("customer1", actualCustomer.getName());
  }
}