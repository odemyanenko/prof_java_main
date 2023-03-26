package classworks.lesson2_20230313.incapsulation.in2;

public class Cat {
  public String name;
  protected int id;
  private int age;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
