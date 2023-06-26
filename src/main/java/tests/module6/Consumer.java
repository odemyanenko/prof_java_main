package tests.module6;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread {
  public static final String MESSAGE_RESOURCE_REMOVED_FROM_WAREHOUSE = "The resource is removed from the warehouse";
  public static final String MESSAGE_RESOURCE_CONSUMED = "Resource consumed";

  private final int num;
  private final int timeConsumer;
  private BlockingQueue warehouse;

  public Consumer(int num, int timeConsumer, BlockingQueue warehouse) {
    setName("Consumer-" + num);
    this.num = num;
    this.timeConsumer = timeConsumer;
    this.warehouse = warehouse;
    start();
  }

  @Override
  public void run() {
    while (true) {
      try {
        Product product = (Product) warehouse.take();
        Log.setInLog(getName(), product, MESSAGE_RESOURCE_REMOVED_FROM_WAREHOUSE);
        Thread.sleep(timeConsumer);
        Log.setInLog(getName(), product, MESSAGE_RESOURCE_CONSUMED);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
