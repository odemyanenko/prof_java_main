package tests.module6;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread {
  public static final String MESSAGE_RESOURCE_PRODUCED = "Resource is produced";
  public static final String MESSAGE_RESOURCE_PUT_IN_WAREHOUSE = "The resource is placed in a warehouse";
  private final int num;
  private final int timeProduction;
  private BlockingQueue warehouse;

  public Producer(int num, int timeProduction, BlockingQueue warehouse) {
    setName("Producer-" + num);
    this.num = num;
    this.timeProduction = timeProduction;
    this.warehouse = warehouse;
    start();
  }

  @Override
  public void run() {
    while (true) {
      try {
        Product product = new Product();
        Log.setInLog(getName(), product, MESSAGE_RESOURCE_PRODUCED);
        warehouse.put(product);
        Log.setInLog(getName(), product, MESSAGE_RESOURCE_PUT_IN_WAREHOUSE);
        Thread.sleep(timeProduction);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
