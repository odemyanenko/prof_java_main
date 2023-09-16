package homeworks.hw_20230824;

public class Producer extends Thread {
  private Warehouse warehouse;

  public Producer(Warehouse warehouse) {
    this.warehouse = warehouse;
  }

  @Override
  public void run() {
    while (!Thread.currentThread().isInterrupted()) {
      int itemCount = RandomUtil.getNumberByMaxValue(warehouse.getCapacity());
      try {
        System.out.println("Producer try produce: " + itemCount);
        warehouse.produce(itemCount);
        System.out.println("Producer produced: " + itemCount);
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }
}
