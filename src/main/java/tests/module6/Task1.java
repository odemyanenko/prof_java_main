package tests.module6;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Task1 {

  public static void main(String[] args) {

    int countOfProducer = 4;
    int timeOfProducer = 2000;

    int countOfConsumer = 6;
    int timeOfConsumer = 2000;

    int sizeOfWarehouse = 5;

    BlockingQueue<Product> warehouse = new ArrayBlockingQueue<>(sizeOfWarehouse);

    for (int i = 0; i < countOfProducer; i++) {
      new Producer(i, timeOfProducer, warehouse);
    }

    for (int i = 0; i < countOfConsumer; i++) {
      new Consumer(i, timeOfConsumer, warehouse);
    }
  }
}