package homeworks.hw5_20230524.generics;

/*
Напишите метод merge, который принимает два отсортированных списка и
возвращает объединенный отсортированный список. Используйте Generics
для обеспечения возможности передачи в метод списков любого типа.
*/

import java.util.ArrayList;
import java.util.List;

public class Task6 {
  public static void main(String[] args) {
    List<Integer> list1 = List.of(10, 20, 30);
    List<Integer> list2 = List.of(2, 6, 12, 20);

    System.out.println("For Integer Type...");
    System.out.println("List 1: " + list1);
    System.out.println("List 2: " + list2);

    List<Integer> listMerged = merge(list1, list2);
    System.out.println("Merged list: " + listMerged);

    List<String> listString1 = List.of("Abc", "Cbf", "Sdn");
    List<String> listString2 = List.of("Anna", "Bob", "Roma", "Zara");

    System.out.println("For String Type...");
    System.out.println("List 1: " + listString1);
    System.out.println("List 2: " + listString2);

    List<String> listStringMerged = merge(listString1, listString2);
    System.out.println("Merged list: " + listStringMerged);
  }

  public static <E extends Comparable<E>> List<E> merge(List<E> list1, List<E> list2) {
    List<E> result = new ArrayList<>();

    int temp1 = 0;
    int temp2 = 0;

    while (temp1 < list1.size() && temp2 < list2.size()) {
      E item1 = list1.get(temp1);
      E item2 = list2.get(temp2);

      if (item1.compareTo(item2) <= 0) {
        result.add(item1);
        temp1++;
      } else {
        result.add(item2);
        temp2++;
      }
    }

    while (temp1 < list1.size()) {
      result.add(list1.get(temp1));
      temp1++;
    }
    while (temp2 < list2.size()) {
      result.add(list2.get(temp2));
      temp2++;
    }

    return result;
  }
}
