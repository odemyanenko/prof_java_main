package homeworks.hw_20230824;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

  @Test
  void checkConsumerAndProducerTest() throws InterruptedException {
    Warehouse warehouse = new Warehouse(1);

    Producer producer = new Producer(warehouse);
    Consumer consumer = new Consumer(warehouse);

    warehouse.produce(1);
    warehouse.consume(1);

    producer.start();
    consumer.start();

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    producer.interrupt();
    consumer.interrupt();

    assertEquals(20, warehouse.getAvailableItems());
  }

  @Test
  public void checkProducerProducesItemsTest() throws InterruptedException {
    Warehouse warehouse = new Warehouse(10);

    Producer producer = new Producer(warehouse);
    producer.start();

    Thread.sleep(3000);

    producer.interrupt();

    assert (warehouse.getAvailableItems() > 0);
  }

  @Test
  public void checkConsumerConsumesItemsTest() throws InterruptedException {
    Warehouse warehouse = new Warehouse(10);
    warehouse.produce(5);

    Consumer consumer = new Consumer(warehouse);
    consumer.start();

    Thread.sleep(3000);

    consumer.interrupt();

    assert (warehouse.getAvailableItems() < 5);
  }

}