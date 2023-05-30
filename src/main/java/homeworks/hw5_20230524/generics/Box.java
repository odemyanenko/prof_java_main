package homeworks.hw5_20230524.generics;

import java.util.ArrayList;
import java.util.List;

class Box<T> {
  private String title;
  List<T> list = new ArrayList<>();

  public Box(String title) {
    this.title = title;
  }

  public T get(int index) {
    return list.get(index);
  }

  public void put(T item) {
    list.add(item);
  }

  @Override
  public String toString() {
    return "Box{" +
            "title='" + title + '\'' +
            ", list=" + list +
            '}';
  }
}