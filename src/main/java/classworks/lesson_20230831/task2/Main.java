package classworks.lesson_20230831.task2;

/*Вы хотите ограничить количество потоков, которые могут одновременно
        достучаться к определенному ресурсу (например, к базе данных).

        Создайте класс Resource (ресурс), представляющий некоторый общий ресурс, к которому потоки должны получать доступ.
        Создайте класс ResourceManager, который будет ограничивать доступ к ресурсу с использованием Semaphore.
        Реализуйте код, который запускает несколько потоков, пытающихся получить доступ к ресурсу.*/

import java.util.concurrent.Semaphore;

public class Main {
  public static void main(String[] args) {
    Resource resource = new Resource();
    Semaphore semaphore = new Semaphore(2);
    ResourceManager resourceManager = new ResourceManager(resource, semaphore);
    Runnable runnable = resourceManager::useResource;
    for (int i = 0; i < 10; i++) {
      Thread thread = new Thread(runnable);
      thread.start();
    }
  }
}

class Resource {
  public void getAccess() throws InterruptedException {
    System.out.println("Access: " + Thread.currentThread().getName());
    Thread.sleep(3000);
    System.out.println("Finished " + Thread.currentThread().getName());
  }
}

class ResourceManager {
  private Resource resource;
  private Semaphore semaphore;

  public ResourceManager(Resource resource, Semaphore semaphore) {
    this.resource = resource;
    this.semaphore = semaphore;
  }

  public void useResource(){
    try {
      semaphore.acquire();
      resource.getAccess();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    } finally {
      semaphore.release();
    }
  }
}
