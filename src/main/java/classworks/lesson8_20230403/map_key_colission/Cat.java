package classworks.lesson8_20230403.map_key_colission;

import java.util.Objects;

public class Cat {
  String name;

  public Cat(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Cat cat)) return false;
    return Objects.equals(name, cat.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
