package classworks.lesson15_20230508.streamPrictice;

import java.util.Arrays;
import java.util.List;

public class Example1SumElements {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
    int totalSumOfEvenElements = 0;

    for (Integer i : list) {
      if (i % 2 == 0) {
        totalSumOfEvenElements += i;
      }
    }
    System.out.println("Сумма всех четных элементов в коллекции: " + totalSumOfEvenElements );


    // functional way

    int result2 = list.stream()
            .filter(p -> p % 2 == 0)
            .mapToInt(Integer::intValue)
            .sum();

    // или другой вариант

    result2 = list.stream()
            .filter(p -> p % 2 == 0)
            .reduce((acc, param) -> acc + param)
            .orElse(0);
    System.out.println(result2);


    // functional way with method reference

    int result3 = list.stream()
            .filter(p -> p % 2 == 0)
            .reduce(Integer::sum)
            .orElse(0);


    System.out.println(result3);
  }
}