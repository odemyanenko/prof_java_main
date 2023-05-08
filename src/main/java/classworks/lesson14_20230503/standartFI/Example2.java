package classworks.lesson14_20230503.standartFI;

import java.util.Random;
import java.util.function.Supplier;

public class Example2 {
  public static void main(String[] args) {
    int range = 100;

    Supplier<Double> doubleSupplier = () -> {
      Random random = new Random();
      return  random.nextDouble(range);
    };

    System.out.println(doubleSupplier.get());
  }
}
