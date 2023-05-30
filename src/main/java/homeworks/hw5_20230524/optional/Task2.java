package homeworks.hw5_20230524.optional;

/*
Напишите метод, который получает значение типа Integer и
возвращает его удвоенное значение, если оно не равно null,
используя Optional.
*/

import java.util.Optional;

public class Task2 {
  public static void main(String[] args) {
    Optional<Integer> optional = getSquareNumber(3);
    System.out.println("Square 3 = " + optional.orElse(Integer.MIN_VALUE));

    Optional<Integer> optionalNull = getSquareNumber(null);
    System.out.println("Square null = " + optionalNull.orElse(Integer.MIN_VALUE));
  }

  public static Optional<Integer> getSquareNumber(Integer number) {
    if (number != null) {
      return Optional.of(number * number);
    } else {
      return Optional.empty();
    }
  }
}
