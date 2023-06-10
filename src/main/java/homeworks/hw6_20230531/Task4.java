package homeworks.hw6_20230531;

/*
Напишите тест, который проверяет, что
- метод getAverage() возвращает правильное среднее значение для
  списка чисел.
*/

import java.util.Arrays;

public class Task4 {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    System.out.println("Original array: " + Arrays.toString(array));
    System.out.println("Average from array: " + getAverage(array));
  }

  public static double getAverage(int[] array) {
    return Arrays.stream(array)
            .average()
            .orElse(0);
  }
}
