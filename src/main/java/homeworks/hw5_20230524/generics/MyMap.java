package homeworks.hw5_20230524.generics;

import java.util.HashMap;
import java.util.Map;

public class MyMap<K, V> {
  private Map<K, V> map;

  public MyMap() {
    this.map = new HashMap<>();
  }

  public void put(K key, V value) {
    map.put(key, value);
  }

  public V get(K key) {
    return map.get(key);
  }

  public void remove(K key) {
    map.remove(key);
  }

  @Override
  public String toString() {
    return "MyMap{" +
            "map=" + map +
            '}';
  }
}
