package classworks.lesson15_20230508.streamPrictice;

import java.util.Arrays;
import java.util.Collection;

public class Example8 {
  public static void main(String[] args) {
    differentMatch();
  }

  public static void differentMatch() {
    Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1", "a10");
    System.out.println("Find first and skip");

    boolean isAnyMore = collection.stream()
            .anyMatch("a1"::equals);
    System.out.println("anyone is - " + isAnyMore);

    boolean isAll = collection.stream()
            .allMatch((s) -> s.contains("1"));
    System.out.println("isAll is - " + isAll);

    boolean isNotEquals = collection.stream()
            .noneMatch((s) -> s.contains("8"));
    System.out.println("isNotEquals is - " + isNotEquals);
  }
}
