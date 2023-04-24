package classworks.lesson10_20230417;

public class Cat {
  String name;

  public Cat(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Cat{" +
            "name='" + name + '\'' +
            '}';
  }
}
