package homeworks.hw5_20230524.optional;

/*
Напишите метод, который получает список целых чисел и
возвращает сумму всех чисел в списке, используя Optional.
*/


import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Task3 {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 4, 5, 6, 7, null);
    System.out.println("Original list: " + list);
    System.out.println("SUM = " + getSumAll(list));

    System.out.println("-----------------------");

    List<Integer> listEmpty = List.of();
    System.out.println("Original list: " + listEmpty);
    System.out.println("SUM = " + getSumAll(listEmpty));
  }

  public static Integer getSumAll(List<Integer> list) {
    return list.stream()
            .filter(Objects::nonNull)
            .mapToInt(Integer::intValue)
            .sum();
  }
}
