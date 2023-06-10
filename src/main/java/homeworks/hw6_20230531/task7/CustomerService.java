package homeworks.hw6_20230531.task7;

import java.util.*;

public class CustomerService {
  private final Map<Integer, Customer> customers;

  public CustomerService() {
    this.customers = new HashMap<>();
  }

  public CustomerService(Map<Integer, Customer> customers) {
    this.customers = customers;
  }

  public Customer getCustomerById(int id) {
    return customers.get(id);
  }
}
