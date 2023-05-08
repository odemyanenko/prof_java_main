package classworks.lesson14_20230503.standartFI;

import java.util.function.Supplier;

public class Example1 {
  public static void main(String[] args) {
    String str = "Hello World!";

    Supplier<String> stringSupplier = () -> str.toUpperCase();
    System.out.println(stringSupplier.get());
  }
}
