package classworks.lesson20_20230524.generics2;

public class Test <T>{
  T obj;

  public Test(T obj) {
    this.obj = obj;
  }

  public T getObj() {
    return obj;
  }
}
