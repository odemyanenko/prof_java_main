package classworks.lesson30_20230703.annotation.annotation2;

public class Child extends Parent{
  @Override
  @Deprecated(since = "1.2", forRemoval = true)
  public void display() {
    System.out.println("Выполнился метод из класса-наследника");
  }
}