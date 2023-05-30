package homeworks.hw5_20230524.optional;

/*
Напишите метод, который получает HashMap, и возвращает Optional
с наибольшим значением, связанным с любым ключом в HashMap.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Task8 {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("A", 10);
    map.put("B", 20);
    map.put("C", 5);

    Optional<Integer> maxOptional = getMaxValue(map);
    if (maxOptional.isPresent()) {
      int maxValue = maxOptional.get();
      System.out.println("Max value: " + maxValue);
    } else {
      System.out.println("HashMap is empty.");
    }
  }

  public static <K, V extends Comparable<V>> Optional<V> getMaxValue(Map<K, V> map) {
    return map.values()
            .stream()
            .max(Comparable::compareTo);
  }
}
