package classworks.lesson26_20230619.my.concurrent.semafore3;

import java.util.concurrent.Semaphore;

public class Main {
  public static void main(String[] args) {
    CommonResources resources = new CommonResources();
    Semaphore semaphore = new Semaphore(2);

    for (int i = 0; i < 3; i++) {
      Thread thread = new Thread(new CommonTask(semaphore, resources));
      thread.start();
    }
  }
}
