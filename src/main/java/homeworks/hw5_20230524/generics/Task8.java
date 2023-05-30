package homeworks.hw5_20230524.generics;

/*
Напишите метод filter, который принимает список объектов и предикат,
и возвращает список объектов, удовлетворяющих предикату. Используйте
Generics для обеспечения возможности передачи в метод списка объектов
любого типа.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Task8 {
  public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(2,-3, 5, 1, 56);
    List<Integer> integerFilteredList = filter(integerList, i -> i >= 5);

    System.out.println("Integer List Original: " + integerList);
    System.out.println("Integer List Filtered: " + integerFilteredList);

    System.out.println("------------------------------------------");

    List<String> stringList = Arrays.asList("bob", "tree", "phone", "you", "we");
    List<String> stringFilteredList = filter(stringList, s -> s.length() > 3);

    System.out.println("String List Original: " + stringList);
    System.out.println("String List Filtered: " + stringFilteredList);
  }

  public static <E> List<E> filter(List<E> list, Predicate<E> predicate){
    List<E> filteredList = new ArrayList<>();
    for (E item: list) {
      if (predicate.test(item)) {
        filteredList.add(item);
      }
    }
    return filteredList;
  }
}
