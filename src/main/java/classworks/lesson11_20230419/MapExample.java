package classworks.lesson11_20230419;

import java.util.*;

public class MapExample {
  public static void main(String[] args) {
    Map<Integer, String> myMap = new HashMap<>();
    myMap.put(1, "one");
    myMap.put(2, "two");
    myMap.put(3, "three");
    myMap.put(4, "four");

    System.out.println("1) -------------------------------------");
    Set<Map.Entry<Integer, String>> entries = myMap.entrySet();
    for (Map.Entry<Integer, String> entry: entries){
      System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
    }

    System.out.println("2) -------------------------------------");
    List<Integer> ourKeys = new ArrayList<>(myMap.keySet());
    System.out.println(ourKeys);
    for (int i = 0; i < ourKeys.size(); i++) {
      System.out.println("Key: " + ourKeys.get(i) + ", value: " + myMap.get(ourKeys.get(i)));
    }

    System.out.println("3) -------------------------------------");
    List<String> ourValues = new ArrayList<>(myMap.values());
    System.out.println(ourValues);

    System.out.println("4) -------------------------------------");
    List<Map.Entry<Integer, String>> ourEntries = new ArrayList<>(myMap.entrySet());
    System.out.println(ourEntries);

    System.out.println("5) -------------------------------------");
    Iterator iterator = myMap.entrySet().iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }

    /*Map<Integer, String> sortedMap = new TreeMap<>(unsortedMap);*/

  }
}
