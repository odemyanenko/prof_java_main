package classworks.lesson29_20230628.reflection.example3;

public class MyClass {
  private int number;
  private String name = "default";

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public void setName(String name) {
    this.name = name;
  }

  private void printData(){

    System.out.println(number + name);
  }
}