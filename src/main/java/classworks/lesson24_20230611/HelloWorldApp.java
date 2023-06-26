package classworks.lesson24_20230611;

import java.util.concurrent.TimeUnit;

public class HelloWorldApp {
  public static void main(String[] args) throws InterruptedException {
    Runnable task = () -> {
      try {
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Thread finished");
      } catch (InterruptedException e) {
        System.out.println("interrupted");
      }
    };

    Thread thread = new Thread(task);
    thread.start();
    thread.join();
    System.out.println("Finished");
  }
}


// JVisualVM