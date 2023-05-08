package classworks.lesson14_20230503.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {
  public static void main(String[] args) {
    List<String> strings = Arrays.asList("10", "20", "1", "10", "50", "25", "20");

    System.out.println("Original:");
    System.out.println(strings.toString());

    //----------------------------
    long count = strings.stream()
            .filter(s -> s.equals("10"))
            .count();

    System.out.println("------------------------");
    System.out.println("Result 1: " + count);
    System.out.println(strings.toString());

    //----------------------------
    List<String> result2 = strings.stream()
            .sorted()
            .collect(Collectors.toList());
    System.out.println("------------------------");
    System.out.println("Result 2: ");
    System.out.println(result2.toString());

    //----------------------------
    List<String> result3 = strings.stream()
            .sorted()
            .filter(e -> Integer.parseInt(e)>10)
            .limit(3)
            .collect(Collectors.toList());
    System.out.println("------------------------");
    System.out.println("Result 3: ");
    System.out.println(result3.toString());

    //----------------------------
    List<String> result4 = strings.stream()
            .sorted()
//            .filter(e -> Integer.parseInt(e)>10)
            .skip(3)
            .collect(Collectors.toList());
    System.out.println("------------------------");
    System.out.println("Result 4: ");
    System.out.println(result4.toString());

    //----------------------------
    List<String> result5 = strings.stream()
            .distinct()
            .collect(Collectors.toList());
    System.out.println("------------------------");
    System.out.println("Result 5: ");
    System.out.println(result5.toString());

    //----------------------------
    List<String> result6 = strings.stream()
            .peek(e -> System.out.println(e + ", "))
            .collect(Collectors.toList());
    System.out.println("------------------------");
    System.out.println("Result 6: ");
    System.out.println(result6.toString());

    //----------------------------
    List<String> result7 = strings.stream()
            .map(e -> e + " times")
            .collect(Collectors.toList());
    System.out.println("------------------------");
    System.out.println("Result 7: ");
    System.out.println(result7.toString());

  }
}
