package classworks.lesson_20230831;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
  public static void main(String[] args) {
    Semaphore semaphore = new Semaphore(2);
    new Emp("Nik", semaphore);
    new Emp("Olga", semaphore);
    new Emp("Lera", semaphore);
    new Emp("Ivan", semaphore);
    new Emp("Kirill", semaphore);
  }
}

class Emp extends Thread {
  String name;
  private Semaphore semaphore;

  public Emp(String name, Semaphore semaphore) {
    this.name = name;
    this.semaphore = semaphore;
    this.setName("THREAD---" + name);
    this.start();
  }

  @Override
  public void run() {
    try {
      semaphore.acquire();
      Thread.sleep(3333);
      System.out.println(name + " is waiting for...|||" + Thread.currentThread().getName());
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    } finally {
      semaphore.release();
    }
  }
}
