package homeworks.hw5_20230524.optional;

/*
Напишите метод, который получает список строк и возвращает
первую строку в списке, если она существует, или бросает
исключение NoSuchElementException, используя Optional.
*/

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Task5 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("qwerty", "sdfsd", "sdfsdf");
    System.out.println("Original list: " + list);
    System.out.println("First string: " + getFirstString(list));

    System.out.println("-----------------------------------------");
    List<String> nullList = List.of();
    System.out.println("Original list: " + nullList);
    System.out.println("First string: " + getFirstString(nullList));
  }

  public static String getFirstString(List<String> list) {
    return Optional.ofNullable(list)
            .flatMap(s -> s.stream().findFirst())
            .orElseThrow(NoSuchElementException::new)
            ;
  }
}
