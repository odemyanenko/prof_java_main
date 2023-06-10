package homeworks.hw6_20230531.task7;

public class Customer {
  private final int id;
  private final String name;

  public Customer(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Customer{" +
            "Id=" + id +
            ", name='" + name + '\'' +
            '}';
  }
}
