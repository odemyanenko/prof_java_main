package homeworks.hw5_20230524.generics;

/*
Напишите метод printList, который принимает список объектов и
выводит их на экран. Используйте Generics для обеспечения
типобезопасности и возможности передачи списка объектов любого типа.
*/

import java.util.ArrayList;
import java.util.List;

public class Task2 {
  public static void main(String[] args) {
    List<Integer> listInteger = List.of(1,2,3);
    List<String> listString = List.of("One", "Two", "Three");

    printList(listInteger);
    printList(listString);
  }

  public static <T> void printList(List<T> list){
    System.out.println("Print list elements type of : " + list.get(0).getClass().getTypeName());
    list.stream()
            .forEach(System.out::println);
  }
}
