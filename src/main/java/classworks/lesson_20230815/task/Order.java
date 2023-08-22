package classworks.lesson_20230815.task;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/*
Order:
Поля:
int orderId
Person customer
List<Product> products
LocalDate orderDate
Методы:

Конструктор с параметрами для инициализации полей.
double calculateTotalPrice() - вычисляет общую стоимость заказа на основе продуктов.
int getNumberOfProducts() - возвращает количество продуктов в заказе.
boolean isOrderExpired() - проверяет, истекла ли дата заказа.
* */
public class Order implements Comparable<Order>{
  private int orderId;
  private Person customer;
  private List<Product> products;
  private LocalDate orderDate;

  public Order(int orderId, Person customer, List<Product> products, LocalDate orderDate) {
    this.orderId = orderId;
    this.customer = customer;
    this.products = products;
    this.orderDate = orderDate;
  }

  public int getOrderId() {
    return orderId;
  }

  public Person getCustomer() {
    return customer;
  }

  public List<Product> getProducts() {
    return Collections.unmodifiableList(products);
  }

  public LocalDate getOrderDate() {
    return orderDate;
  }

  // - вычисляет общую стоимость заказа на основе продуктов.
  public double calculateTotalPrice(){
    return this.products.stream()
            .mapToDouble(Product::getTotalPrice)
            .sum();
  }

  // - возвращает количество продуктов в заказе.
  int getNumberOfProducts(){
    return this.products.stream()
            .mapToInt(Product::getQuantity)
            .sum();
  }

  // - проверяет, истекла ли дата заказа.
  boolean isOrderExpired(){
      LocalDate currentDate = LocalDate.now();
      return currentDate.isAfter(orderDate);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Order order)) return false;
    return orderId == order.orderId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId);
  }

  @Override
  public String toString() {
    return "Order{" +
            "orderId=" + orderId +
            ", customer=" + customer +
            ", products=" + products +
            ", orderDate=" + orderDate +
            '}';
  }

  @Override
  public int compareTo(Order o) {
    return orderId - o.orderId;
  }
}
