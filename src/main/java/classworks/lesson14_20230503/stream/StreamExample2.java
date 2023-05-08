package classworks.lesson14_20230503.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample2 {
  public static void main(String[] args) {
    // - без потока

    int[] arr = {50,60,70,80,90,100,110,120};

    int count = 0;

    for (int x : arr){
      if (x >= 90) {
        x += 10;
        count++;
        if (count > 3) break;
        System.out.println(x);
      }
    }

    IntStream.of(50,60,70,80,90,100,110,120)
            .filter((x -> x >= 90))
            .map(x -> x + 10)
            .limit(3)
            .forEach(System.out::println);



  }
}