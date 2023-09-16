package homeworks.hw_20230824;

public class Main {
  public static void main(String[] args) {
    Warehouse warehouse = new Warehouse(30);

    Producer producer = new Producer(warehouse);
    Consumer consumer = new Consumer(warehouse);

    producer.start();
    consumer.start();

//    try {
//      producer.join();
//      consumer.join();
//    } catch (InterruptedException e) {
//      throw new RuntimeException(e);
//    }
  }
}
