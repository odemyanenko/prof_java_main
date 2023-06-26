package classworks.lesson24_20230611.interrupted.interrupt;

public class Example7 implements Runnable {
  @Override
  public void run() {
    try {
      while (!Thread.interrupted()) {
        System.out.println("Thread is running!");
        Thread.sleep(1_000);
      }
    } catch (InterruptedException e) {
      System.out.println("Thread interrupted");
      //Thread.currentThread().interrupt();
    }
  }

  public static void main(String[] args) throws InterruptedException {
    Example7 example7 = new Example7();

    Thread thread = new Thread(example7);
    thread.start();
    Thread.sleep(5_000);
    thread.interrupt();
  }
}
