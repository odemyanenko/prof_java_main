package classworks.lesson_20230829.task;

import classworks.lesson_20230829.task.enums.DishStatus;
import classworks.lesson_20230829.task.enums.OrderStatus;

public class OrderProcessor {
  private Kitchen kitchen;

  public OrderProcessor(Kitchen kitchen) {
    this.kitchen = kitchen;
  }

  public void processOrder(Order order) {
    order.setStatus(OrderStatus.COOKING);
    for (Dish dish : order.getDishes()) {
      kitchen.cookDish(dish);
    }
    try {
      do {
        wait();
      } while (order.getDishes().stream().anyMatch(d -> d.getStatus() != DishStatus.READY));
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    order.setStatus(OrderStatus.READY);
  }
}
