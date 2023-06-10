package homeworks.hw6_20230531.task7;

/*
Создайте класс CustomerService, который имеет метод getCustomerById(),
который возвращает объект Customer по его идентификатору. Напишите тест,
который проверяет, что метод getCustomerById() возвращает правильный
объект Customer для заданного идентификатора.
*/

import java.util.HashMap;
import java.util.Map;

public class Task7 {
  public static void main(String[] args) {
    Map<Integer,Customer> customerMap= new HashMap<>();

    Customer customer1 = new Customer(1, "customer1");
    Customer customer2 = new Customer(2, "customer2");
    Customer customer3 = new Customer(3, "customer3");

    customerMap.put(1, customer1);
    customerMap.put(2, customer2);
    customerMap.put(3, customer3);

    CustomerService service = new CustomerService(customerMap);

    Customer customer = service.getCustomerById(2);
    System.out.println("Found customer: " + customer);

  }
}
