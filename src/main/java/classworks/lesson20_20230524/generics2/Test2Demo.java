package classworks.lesson20_20230524.generics2;

public class Test2Demo {
  public static void main(String[] args) {
    Test2<Integer, String> test1 = new Test2<>(15, "Generic");
    test1.print();

    Test2<String, String> test2 = new Test2<>("adasdasd", "2asdfafd");
    test2.print();
  }
}
