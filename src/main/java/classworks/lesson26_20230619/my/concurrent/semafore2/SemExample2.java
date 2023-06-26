package classworks.lesson26_20230619.my.concurrent.semafore2;

import java.util.concurrent.Semaphore;

public class SemExample2 {
  public static void main(String[] args) {
    Semaphore semaphore = new Semaphore(3);
    for (int i = 0; i < 10; i++) {
      Thread thread = new Thread(new Buyer(semaphore, "Thread # " + i));
      thread.start();
    }
  }
}
