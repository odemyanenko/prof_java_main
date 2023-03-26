package classworks.lesson3_20230315.compareObj;

import java.util.Objects;

public class Cat {
  String name;

  public Cat(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Cat cat = (Cat) o;
    return name.equals(cat.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
