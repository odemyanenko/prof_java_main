package classworks.lesson15_20230508.streamPrictice;

import java.util.Arrays;
import java.util.List;

public class Example1Count {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
    int result = 0;

    for (Integer i : list) {
      if (i % 2 == 0) {
        result +=1;
      }
    }
    System.out.println("Количество четных элементов в коллекции: " + result );


    // functional way

    long result2 = list.stream()
            .filter(p -> p % 2 == 0)
            .count();


    System.out.println(result2);
  }
}