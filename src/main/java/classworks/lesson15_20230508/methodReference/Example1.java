package classworks.lesson15_20230508.methodReference;

import java.util.Arrays;
import java.util.List;

public class Example1 {
  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1,2,3,4,5);

    numbers.forEach(number -> System.out.print(number + "; "));


    numbers.forEach(number -> System.out.print(number));
    // 14 и 16 строки равносильны друг другу (просто укороченная форма записи)
    numbers.forEach(System.out::println);

  }
}