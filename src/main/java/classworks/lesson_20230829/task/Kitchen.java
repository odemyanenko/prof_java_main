package classworks.lesson_20230829.task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Kitchen {
  private ExecutorService chefThreadPool;

  public Kitchen(int chefCount) {
    chefThreadPool = Executors.newFixedThreadPool(chefCount);
  }

  public void cookDish(Dish dish) {
    chefThreadPool.execute(()->{
      System.out.println("Cooking dish: " + dish.getName() + " with Thread " + Thread.currentThread().getName());
      try {
        Thread.sleep(dish.getPreparationTime());
      } catch (InterruptedException e) {
        Thread.interrupted();
        System.out.println(dish.getName() + " The process was interrupted");
      }
      System.out.println(dish.getName() + " is ready");
    });
  }

  public void shutdown() {
    chefThreadPool.shutdown();
  }
}
