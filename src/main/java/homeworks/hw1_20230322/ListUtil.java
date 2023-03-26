package homeworks.hw1_20230322;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListUtil {
  private static final int MAX_COUNT_ELEMENTS = 15;

  public static List<Integer> createArrayList() {
    return new ArrayList<>(MAX_COUNT_ELEMENTS);
  }

  public static List<Integer> createLinkedList() {
    return new LinkedList<>();
  }

  public static void fillListRandomNumbers(List<Integer> list, int range) {
    Random random = new Random();
    for (int i = 0; i < MAX_COUNT_ELEMENTS; i++) {
      list.add(random.nextInt(range));
    }
  }

  public static void fillListRandomNumbers(List<Integer> list, int count, int range) {
    Random random = new Random();
    for (int i = 0; i < count; i++) {
      int temp = random.nextInt(range);
      list.add(temp);
    }
  }

  public static <T> void printElements(List<T> list) {
    System.out.println("All elements of list: ");
    for (T elem : list
    ) {
      System.out.print(elem + " ");
    }
    System.out.println();
  }
}
