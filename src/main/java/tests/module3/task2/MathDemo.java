package tests.module3.task2;

/*

Создайте класс со статическими методами,
реализующими следующие математические функции: y = x*x, y = 3x+5, y = 1/x, y = x*x*x, y = |x|.

В основной программе создайте метод test(),
который будет принимать  в качестве аргумента ссылку на один из методов,
реализующих математическую функцию,
и выводить в консоль результат вычисления функции для целых чисел x в интервале -10 < x < -1.

*/
import java.util.stream.IntStream;

public class MathDemo {
  public static void main(String[] args) {
    System.out.println("function y = x*x");
    IntStream.range(-9, -1).forEach(x -> {
      System.out.print(x + ": ");
      test(MathUtils.func1(x));
      System.out.print(" ");
    });

    System.out.println("\n----------------------------------------------------------------------------------");
    System.out.println("function y = 3x+5");
    IntStream.range(-9, -1).forEach(x -> {
      System.out.print(x + ": ");
      test(MathUtils.func2(x));
      System.out.print(" ");
    });

    System.out.println("\n----------------------------------------------------------------------------------");
    System.out.println("function y = 1/x");
    IntStream.range(-9, -1).forEach(x -> {
      System.out.print(x + ": ");
      test(MathUtils.func3(x));
      System.out.print(" ");
    });

    System.out.println("\n----------------------------------------------------------------------------------");
    System.out.println("function y = x*x*x");
    IntStream.range(-9, -1).forEach(x -> {
      System.out.print(x + ": ");
      test(MathUtils.func4(x));
      System.out.print(" ");
    });

    System.out.println("\n----------------------------------------------------------------------------------");
    System.out.println("function y = |x|");
    IntStream.range(-9, -1).forEach(x -> {
      System.out.print(x + ": ");
      test(MathUtils.func5(x));
      System.out.print(" ");
    });
  }

  private static void test(Double func) {
    System.out.print(func);
  }
}
