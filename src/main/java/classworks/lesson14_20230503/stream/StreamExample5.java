package classworks.lesson14_20230503.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamExample5 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("BigBen", "BigBob", "Big", "BigPen", "BigCall");

    System.out.println(
            list.stream()
                    .filter(s -> s.equals("Big"))
                    .count()
    );


    List<String> list2 = Arrays.asList("a1", "b5", "a2", "b4");
    System.out.println(
            list2.stream()
//                    .min((o1, o2) -> o1.compareTo(o2))
                    .min(String::compareTo)
                    .get()
    );

    List<String> list4 = Arrays.asList("a1", "b5", "a2", "b4");
    System.out.println(
            list4.stream()
                    .sorted((o1,o2) -> (-1) * o1.compareTo(o2))
//                    .sorted((o1,o2) -> o2.compareTo(o1))
//                    .sorted(Comparator.reverseOrder())
                    .distinct()
                    .toList()
    );
  }
}
