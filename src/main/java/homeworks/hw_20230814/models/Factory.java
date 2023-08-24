package homeworks.hw_20230814.models;

import java.util.Objects;
import java.util.UUID;

public class Factory {
  private final UUID id;
  private String name;
  private boolean isDebt;

  public Factory(String name, boolean isDebt) {
    this.id = UUID.randomUUID();
    this.name = name;
    this.isDebt = isDebt;
  }

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Factory factory)) return false;
    return isDebt == factory.isDebt && id.equals(factory.id) && name.equals(factory.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isDebt);
  }

  @Override
  public String toString() {
    return "Factory{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", isDebt=" + isDebt +
            '}';
  }
}
