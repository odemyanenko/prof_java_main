package classworks.lesson_20230829;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TP2 {
  public static void main(String[] args) throws InterruptedException {
    ExecutorService executorService = Executors.newSingleThreadExecutor();

    for (int i = 0; i < 10; i++) {
      executorService.execute(new ERun2());
    }

    executorService.shutdown();
    System.out.println("Main End");
  }
}

class ERun2 implements Runnable {
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " ===START!");

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    System.out.println(Thread.currentThread().getName() + " ===END!");
  }
}
