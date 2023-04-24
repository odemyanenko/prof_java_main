package classworks.lesson8_20230403.lessoncode;

import java.util.*;

public class MapExample1 {
  public static void main(String[] args) {
    Integer[] arr = {1, 7, 4, 9, 12, 45, 3, 9, 23, 1, 7, 12, 12};

    HashMap<Integer, Integer> ourMap = createHashMapCollection(arr);
    System.out.println(ourMap);

    System.out.println("----------------------------");
    Set<Integer> ourSet = new HashSet<>(Arrays.asList(arr));
    System.out.println(ourSet);
  }

  private static HashMap<Integer, Integer> createHashMapCollection(Integer[] arr) {
    HashMap<Integer, Integer> ourMap = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      int count = 0;
      if (ourMap.get(arr[i]) != null) {
        count = ourMap.get(arr[i]);
      }
      ourMap.put(arr[i], ++count);
    }

    return ourMap;
  }
}
