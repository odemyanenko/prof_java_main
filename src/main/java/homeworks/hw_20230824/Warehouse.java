package homeworks.hw_20230824;

public class Warehouse {
  private static final Object MONITOR = new Object();
  private final int capacity;
  private volatile int availableItems;

  public Warehouse(int capacity) {
    this.capacity = capacity;
    this.availableItems = 0;
  }

  public int getAvailableItems() {
    return availableItems;
  }

  public int getCapacity() {
    return capacity;
  }

  //Добавляет заданное количество товаров на склад.
  public void produce(int amount) throws InterruptedException {
    synchronized (MONITOR) {
      while (availableItems + amount > capacity) {
        MONITOR.wait();
      }
      availableItems += amount;
      MONITOR.notifyAll();
    }
  }

  //Изымает заданное количество товаров со склада.
  public void consume(int amount) throws InterruptedException {
    synchronized (MONITOR) {
      while (availableItems < amount) {
        MONITOR.wait();
      }
      availableItems -= amount;
      MONITOR.notifyAll();
    }
  }
}
