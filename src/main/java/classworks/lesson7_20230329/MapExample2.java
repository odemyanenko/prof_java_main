package classworks.lesson7_20230329;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
  public static void main(String[] args) {
    Map<Integer, Dog> map = new HashMap<>();

    map.put(1, new Dog("Tizik", 2));
    map.put(2, new Dog("Bobik", 1));
    map.put(3, new Dog("Gav", 3));

    System.out.println(map);
  }
}
