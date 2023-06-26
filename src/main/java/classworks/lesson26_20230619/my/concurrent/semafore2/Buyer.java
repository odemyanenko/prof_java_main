package classworks.lesson26_20230619.my.concurrent.semafore2;

import java.util.concurrent.Semaphore;

public class Buyer implements Runnable {
  private Semaphore semaphore;
  private String name;

  public Buyer(Semaphore semaphore, String name) {
    this.semaphore = semaphore;
    this.name = name;
  }

  @Override
  public void run() {
    System.out.println(name + " wait in queue in shop");
    try {
      semaphore.acquire();
      System.out.println(name + " go into shop");
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println(name + " bought products and went out from shop");
    semaphore.release();
  }
}
