package homeworks.hw5_20230524.optional;

/*
Напишите метод, который получает значение типа Integer и
возвращает его удвоенное значение, если оно не равно null,
или бросает исключение IllegalArgumentException, используя Optional.
*/

import java.util.Optional;

public class Task6 {
  public static void main(String[] args) {
    System.out.println("Increase 42*2 = " + getIncreaseValue(42));
    System.out.println("Increase null*2 = " + getIncreaseValue(null));
  }

  public static int getIncreaseValue(Integer num) {
    return Optional.ofNullable(num)
            .map(e -> e * 2)
            .orElseThrow(IllegalArgumentException::new)
            ;
  }
}
