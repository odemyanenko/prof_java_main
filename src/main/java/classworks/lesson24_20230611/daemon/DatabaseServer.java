package classworks.lesson24_20230611.daemon;

public class DatabaseServer implements Runnable {
  @Override
  public void run() {
    while (true) {
      try {
        Thread.sleep(600_000);
      } catch (InterruptedException e) {

      }
    }
  }
}
