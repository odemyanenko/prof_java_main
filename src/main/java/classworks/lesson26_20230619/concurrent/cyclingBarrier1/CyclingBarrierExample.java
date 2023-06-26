package classworks.lesson26_20230619.concurrent.cyclingBarrier1;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclingBarrierExample {
  private static final int NUMBEROFTHREADS = 12;

  public static void main(String[] args) {
    // создадим экземпляр CyclingBarrier
    int numberOfThreadsInOneParty = 5;
    CyclicBarrier cyclicBarrier = new CyclicBarrier(numberOfThreadsInOneParty, () -> {
      System.out.println(numberOfThreadsInOneParty + " потока достигли нашего барьера и выполняется действие после этого момента");
    });
    // создаем и запускаем потоки

    for (int i = 0; i < NUMBEROFTHREADS; i++) {
      Thread thread = new Thread(new Worker(i, cyclicBarrier));
      thread.start();
    }
  }
  static class Worker implements Runnable {
    private final int idWorker;
    private final CyclicBarrier cyclicBarrier;

    public Worker(int idWorker, CyclicBarrier cyclicBarrier) {
      this.idWorker = idWorker;
      this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {

      System.out.println("Поток " + idWorker + " начинает и выполняет свое задание");

      try {
        Random random = new Random();
        Thread.sleep(random.nextInt(2000,3000));
        System.out.println("Поток " + idWorker + " достиг барьера ");
        cyclicBarrier.await();
        System.out.println("Поток " + idWorker + " продолжает работу после барьера ");

      }catch (InterruptedException | BrokenBarrierException e) {}

    }
  }

}