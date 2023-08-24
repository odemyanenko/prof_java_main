package homeworks.hw_20230814.models;

import java.util.Objects;
import java.util.UUID;

public class Category {
  private final UUID id;
  private String name;


  public Category(String name) {
    this.id = UUID.randomUUID();
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Category category)) return false;
    return id.equals(category.id) && name.equals(category.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    return "Category{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }
}
