package homeworks.hw5_20230524.generics;

/*
Напишите метод findMax, который принимает массив объектов и возвращает
наибольший из них. Используйте Generics для обеспечения возможности
передачи массива объектов любого типа.
*/

import java.util.Arrays;

public class Task4 {
  public static void main(String[] args) {
    Integer[] arrayInteger = {1, 2, 3, 4, 5, 6};
    String[] arrayString = {"tree", "one", "cat", "bed", "dream", "yellow"};

    System.out.println(Arrays.toString(arrayInteger));
    System.out.println("Max in array : " + findMax(arrayInteger));

    System.out.println(Arrays.toString(arrayString));
    System.out.println("Max in array : " + findMax(arrayString));
  }

  public static <T extends Comparable<T>> T findMax(T[] array) {
    if (array.length == 0) {
      return null;
    }
    return Arrays.stream(array)
            .max(Comparable::compareTo)
            .get()
            ;
  }
}
