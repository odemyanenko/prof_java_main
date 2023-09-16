package classworks.lesson_20230829.task;

/*Создайте класс Dish, представляющий отдельное блюдо.
        У каждого блюда должно быть имя и время приготовления в миллисекундах.*/

import classworks.lesson_20230829.task.enums.DishStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
class Dish {
  private String name;
  private long preparationTime; // in milliseconds
  private DishStatus status;

  public Dish(String name, long preparationTime) {
    this.name = name;
    this.preparationTime = preparationTime;
    this.status = DishStatus.NEW;
  }
}