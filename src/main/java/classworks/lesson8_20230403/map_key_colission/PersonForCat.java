package classworks.lesson8_20230403.map_key_colission;

import java.util.Objects;

public class PersonForCat {
  String name;

  public PersonForCat(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof PersonForCat that)) return false;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
