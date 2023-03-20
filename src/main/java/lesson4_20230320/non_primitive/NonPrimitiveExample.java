package lesson4_20230320.non_primitive;

public class NonPrimitiveExample {
  public static void main(String[] args) {
    Integer x = 5;
    int x1 = x;

    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);

    String str = "10";
    int strNumber = Integer.parseInt(str);
    System.out.println(++strNumber);
  }
}
