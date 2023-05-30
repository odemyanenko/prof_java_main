package homeworks.hw5_20230524.optional;

/*
Напишите метод, который получает список объектов и функцию проверки,
и возвращает Optional с первым объектом в списке, который соответствует
условиям функции проверки.
*/

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Task10 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("tent", "roman", "rep", "bot");
    Optional<String> optional = getCorrectElement(list, e -> e.length() < 4);
    System.out.println("First correct element: " + optional.orElse("-"));
  }

  public static <T> Optional<T> getCorrectElement(List<T> list, Predicate<T> predicate) {
    return list.stream()
            .filter(predicate)
            .findFirst()
            ;
  }
}
