package classworks.lesson27_20230621.phaser;

import java.util.concurrent.Phaser;

public class PhaserExample0 {
  public static void main(String[] args) {
    Phaser phaser = new Phaser(1);
    // начинаем с 1 - чтобы зарегистрировать только основной поток, а он уже
    // в свою очередь будет ожидать регистрацию других потоков

    // Создадим и запустим потоки

    MyRunnable27[] runnables = new MyRunnable27[3];
    for (int i = 0; i < 3; i++) {
      runnables[i] = new MyRunnable27(phaser);
      Thread thread = new Thread(runnables[i]);
      thread.start();
    }

    phaser.arriveAndDeregister();

    System.out.println("Все фазы завершены. Программа завершена");


  }

  static class MyRunnable27 implements Runnable {
    private final Phaser phaser;

    public MyRunnable27(Phaser phaser) {
      this.phaser = phaser;
    }

    @Override
    public void run() {

      for (int i = 0; i < 3; i++) {
        // Действие при достижении конца фазы
        System.out.println("Фаза "  + (i +1) + " выполнена для потока " + Thread.currentThread().getName());
        // ожидание достижения конца фазы
        phaser.arriveAndAwaitAdvance();
      }
      // отказ от регистрации в фазере
      phaser.arriveAndDeregister();
    }
  }
}