package classworks.lesson15_20230508.streamPrictice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class Example7 {
  public static void main(String[] args) {
    findansSkipCount();
  }

  public static void findansSkipCount() {
    Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1", "a10");

    System.out.println("Find first and skip");
    String first = collection.stream().findFirst().orElse("Test1");

    System.out.println("first element = " + first);

    String last = collection.stream()
            .skip(collection.size() - 1)
            .findAny()
            .orElse("Test2");
    System.out.println("last element = " + last);

    String a3Element = collection.stream()
            .filter("a3"::equals)
            .findFirst()
            .get();
    System.out.println("a3 element" + a3Element);

    String a4Element = collection.stream()
            .filter("a3"::equals)
            .findFirst()
            .get();
  }
}
