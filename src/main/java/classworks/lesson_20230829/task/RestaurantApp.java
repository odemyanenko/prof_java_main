package classworks.lesson_20230829.task;

import java.util.ArrayList;
import java.util.List;

public class RestaurantApp {
  public static void main(String[] args) {
    Kitchen kitchen = new Kitchen(3);
    OrderProcessor processor = new OrderProcessor(kitchen);

    List<Order> orders = new ArrayList<>();

    Order order1 = new Order(List.of(
            new Dish("Chicken", 1000),
            new Dish("Pizza", 2000),
            new Dish("Fish", 3000),
            new Dish("Potato", 4000)
    ));
    orders.add(order1);

    Order order2 = new Order(List.of(
            new Dish("Beef", 1000),
            new Dish("Pizza", 2000),
            new Dish("Desert", 3000)
    ));
    orders.add(order2);

    for (Order order : orders) {
      processor.processOrder(order);
    }
  }
}
