package tests.module6.gpt;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Semaphore;

public class ProductionConsumptionExample {
  private static final int N = 5; // Количество производителей
  private static final int M = 3; // Количество потребителей
  private static final int S = 10; // Размер склада
  private static final int MAX_RESOURCES = 20; // Общее количество ресурсов

  private static Lock lock = new ReentrantLock();
  private static Condition producersCondition = lock.newCondition();
  private static Condition consumersCondition = lock.newCondition();
  private static Semaphore resourcesSemaphore = new Semaphore(0);

  private static int resourcesOnStorage = 0;

  public static void main(String[] args) {
    Thread[] producers = new Thread[N];
    Thread[] consumers = new Thread[M];

    for (int i = 0; i < N; i++) {
      int producerId = i;
      producers[i] = new Thread(() -> {
        while (true) {
          produceResource(producerId);
        }
      });
      producers[i].start();
    }

    for (int i = 0; i < M; i++) {
      int consumerId = i;
      consumers[i] = new Thread(() -> {
        while (true) {
          consumeResource(consumerId);
        }
      });
      consumers[i].start();
    }
  }

  public static void produceResource(int producerId) {
    lock.lock();
    try {
      while (resourcesOnStorage == S) {
        try {
          producersCondition.await();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

      // Производство ресурса
      int resourceId = generateResourceId();
      resourcesOnStorage++;
      System.out.println(getLogMessage(producerId, resourceId, "Ресурс произведен"));

      // Помещение ресурса на склад
      if (resourcesOnStorage == 1) {
        consumersCondition.signalAll();
      }
      resourcesSemaphore.release();
      System.out.println(getLogMessage(producerId, resourceId, "Ресурс помещен на склад"));
    } finally {
      lock.unlock();
    }
  }

  public static void consumeResource(int consumerId) {
    lock.lock();
    try {
      while (resourcesOnStorage == 0) {
        try {
          consumersCondition.await();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

      try {
        resourcesSemaphore.acquire();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      // Забор ресурса со склада
      resourcesOnStorage--;
      int resourceId = generateResourceId();
      System.out.println(getLogMessage(consumerId, resourceId, "Ресурс забран со склада"));

      // Потребление ресурса
      if (resourcesOnStorage == S - 1) {
        producersCondition.signalAll();
      }
    } finally {
      lock.unlock();
    }
  }

  public static int generateResourceId() {
    return (int) (Math.random() * MAX_RESOURCES) + 1;
  }

  public static String getLogMessage(int threadId, int resourceId, String event) {
    String threadType = threadId < N ? "Производитель" : "Потребитель";
    return String.format("Время: %s, Поток: %s%d, Ресурс: %d, Событие: %s",
            System.currentTimeMillis(), threadType, (threadId + 1), resourceId, event);
  }
}
