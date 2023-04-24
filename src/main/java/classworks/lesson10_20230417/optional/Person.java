package classworks.lesson10_20230417.optional;

public class Person {
  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            '}';
  }
}
