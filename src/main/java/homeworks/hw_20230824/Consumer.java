package homeworks.hw_20230824;

import java.util.Random;

public class Consumer extends Thread {
  private Warehouse warehouse;

  public Consumer(Warehouse warehouse) {
    this.warehouse = warehouse;
  }

  @Override
  public void run() {
    while (!Thread.currentThread().isInterrupted()) {
      int itemCount = RandomUtil.getNumberByMaxValue(warehouse.getCapacity());
      try {
        System.out.println("Consumer try consume: " + itemCount);
        warehouse.consume(itemCount);
        System.out.println("Consumer consumed: " + itemCount);
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }
}
