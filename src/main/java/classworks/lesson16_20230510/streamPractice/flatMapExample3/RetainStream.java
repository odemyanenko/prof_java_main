package classworks.lesson16_20230510.streamPractice.flatMapExample3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetainStream {
  public static void main(String[] args) {
    List<Integer> list1 = Arrays.asList(1,2,3,4);
    List<Integer> list2 = Arrays.asList(3,4,5,6,7);

    List<Integer> commonInteger = new ArrayList<>(list1);

    commonInteger.retainAll(list2);

    if (!commonInteger.isEmpty()) {
      System.out.println("Общие элементы коллекций: " + commonInteger);
    }

  }
}