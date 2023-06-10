package homeworks.hw6_20230531;

/*
Напишите тест, который проверяет, что:
- метод getMax() возвращает правильное максимальное значение для
  списка чисел.
*/

import java.util.Arrays;
import java.util.List;

public class Task5 {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(-1, 2, -3, 4, -5);
    System.out.println("Original list: " + list);
    System.out.println("Max Value in list: " + getMax(list));
  }

  public static int getMax(List<Integer> list) {
    return list.stream()
            .mapToInt(e -> e)
            .max().orElse(Integer.MIN_VALUE);
  }
}
