package classworks.lesson19_20230522.exceptions;

public class Example1 {
  public static void main(String[] args) {
    try {
      System.out.println(divide(4, 2));
      System.out.println(divide(23, 1));
      System.out.println(divide(12, 3));
      System.out.println(divide(4, 0));
      System.out.println(divide(12, 3));


    } catch (ArithmeticException e) {
      System.out.println("Error:" + e.getMessage());
      System.out.println("Error divide");
    }
    System.out.println("Program finished!");

  }

  private static double divide(int num1, int num2) {
    return num1 / num2;
  }
}
