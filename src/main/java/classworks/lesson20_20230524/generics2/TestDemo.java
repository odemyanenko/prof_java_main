package classworks.lesson20_20230524.generics2;

public class TestDemo {
  public static void main(String[] args) {
    Test<Integer> test1 = new Test<>(15);
    System.out.println(test1.getObj());

    Test<String> test2 = new Test<>("adasdasd");
    System.out.println(test2.getObj());
  }
}
