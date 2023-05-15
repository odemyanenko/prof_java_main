package classworks.lesson15_20230508.streamPrictice;

import java.util.Arrays;
import java.util.List;

public class Example2 {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    int result = 0;

    for (Integer i : list) {
      if (i % 2 == 0) {
        result += i;
      }
    }
    System.out.println("Count: " + result);

    System.out.println("--------------");
    int result2 = list.stream()
            .filter(p -> p % 2 == 0)
            .mapToInt(Integer::intValue)
            .sum()
            ;
    System.out.println("Count: " + result2);

    System.out.println("--------------");
    int result3 = list.stream()
            .filter(p -> p % 2 == 0)
            .reduce(Integer::sum)
            .orElse(0)
            ;
    System.out.println("Count: " + result3);
  }
}
