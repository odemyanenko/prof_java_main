package classworks.lesson7_20230329;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();

    map.put(1, "Viktor");
    map.put(2, "Petya");
    map.put(3, "Oleg");

    System.out.println(map);

    System.out.println("---------------------");
    Map<String, Integer> map2 = new HashMap<>();
    map2.put("Viktor", 1);
    map2.put("Petya", 2);
    map2.put("Oleg", 3);
    System.out.println(map2);
  }
}
