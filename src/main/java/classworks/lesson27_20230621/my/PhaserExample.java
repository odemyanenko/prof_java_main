package classworks.lesson27_20230621.my;

import java.util.concurrent.Phaser;

public class PhaserExample {
  public static void main(String[] args) {
    Phaser phaser = new Phaser(1);

    MyRunnable27[] runnables = new MyRunnable27[3];
    for (int i = 0; i < 3; i++) {
      runnables[i] = new MyRunnable27(phaser);
      Thread thread = new Thread(runnables[i]);
      thread.start();
    }
    phaser.arriveAndDeregister();
    System.out.println("All phases completed. Program finished.");
  }

  static class MyRunnable27 implements Runnable {
    private final Phaser phaser;

    public MyRunnable27(Phaser phaser) {
      this.phaser = phaser;
    }

    @Override
    public void run() {
      for (int i = 0; i < 3; i++) {
        System.out.println("Phase " + (i + 1) + " executed for thread: " + Thread.currentThread().getName());
        phaser.arriveAndAwaitAdvance();
      }
      phaser.arriveAndDeregister();
    }
  }
}
