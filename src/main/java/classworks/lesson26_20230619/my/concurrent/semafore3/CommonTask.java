package classworks.lesson26_20230619.my.concurrent.semafore3;

import java.util.concurrent.Semaphore;

public class CommonTask implements Runnable{
  private Semaphore semaphore;
  private CommonResources resources;

  public CommonTask(Semaphore semaphore, CommonResources resources) {
    this.semaphore = semaphore;
    this.resources = resources;
  }

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " wait in queue");
    try {
      semaphore.acquire();
      resources.setX(1);
      System.out.println(Thread.currentThread().getName() + " go");

      for (int i = 0; i < 10; i++) {
        resources.increment();
        System.out.println(Thread.currentThread().getName() + " increment: " + resources.getX());
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println(Thread.currentThread().getName() + " increment: " + resources.getX());
    semaphore.release();
  }
}
