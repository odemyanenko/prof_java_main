package classworks.lesson26_20230619.my.concurrent.exchanger;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Exchanger;

public class DeliveryExample {
  public static void main(String[] args) {
    Exchanger<List<String>> exchanger = new Exchanger<>();

    List<String> goods1 = Arrays.asList("Item1", "Item2");
    List<String> goods2 = Arrays.asList("Item3", "Item4", "Item5");

    Truck truck1 = new Truck(1, "Factory A", "Factory B", goods1, exchanger);
    Truck truck2 = new Truck(2, "Factory B", "Factory A", goods2, exchanger);

    new Thread(truck1).start();
    new Thread(truck2).start();
  }
}
