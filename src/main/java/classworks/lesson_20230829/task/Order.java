package classworks.lesson_20230829.task;

/*Создайте класс Order, который представляет заказ в ресторане.
        У заказа должен быть уникальный идентификатор, состоящий из буквы "O" и номера (например, "O123").
        Заказ также должен иметь статус (новый, готовится, готов) и список блюд.*/

import classworks.lesson_20230829.task.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Order {
  private String id;
  private List<Dish> dishes;

  public Order(List<Dish> dishes) {
    this.id = generateId();
    this.status = OrderStatus.NEW;
    this.dishes = dishes;
  }

  @Setter
  private OrderStatus status;

  public void addDish(Dish dish) {
    dishes.add(dish);
  }

  private String generateId() {
    return "O" + (int) (Math.random() * 1000);
  }
}
