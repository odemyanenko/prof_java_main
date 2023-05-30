package homeworks.hw5_20230524.optional;

/*
Напишите метод, который получает список строк и возвращает
первую строку в списке, если она существует,
или пустую строку в противном случае, используя Optional.
*/

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task1 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("bob", "weather", "mother");
    Optional<String> stringOptional = getFirstRow(list);
    System.out.println("First Row: " + stringOptional.orElse(""));

    List<String> listEmpty = Arrays.asList();
    Optional<String> stringOptionalEmpty = getFirstRow(listEmpty);
    System.out.println("First Row: " + stringOptionalEmpty.orElse(""));
  }

  public static Optional<String> getFirstRow(List<String> list) {
    return list.stream()
            .findFirst()
            ;
  }
}
