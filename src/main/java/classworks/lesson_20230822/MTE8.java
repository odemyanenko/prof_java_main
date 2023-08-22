package classworks.lesson_20230822;

public class MTE8 {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("Main start");
    System.out.println("Main: " + Thread.currentThread().getName());

    Thread t1 = new Thread(new R1());
    System.out.println("T1: " + t1.getState());

    Thread t2 = new Thread(new R2());
    System.out.println("T2: " + t2.getState());

    t1.start();
    System.out.println("T1 after start: " + t1.getState());

    t2.start();
    System.out.println("T2 after start: " + t2.getState());

    t1.join();
    System.out.println("T1 join(): " + t1.getState());

    t2.join();
    System.out.println("T2 join(): " + t2.getState());

    System.out.println("Main end.");
    System.out.println("Main end: " + Thread.currentThread().getState());
  }
}

class R1 implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("T1: " + i);
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    System.out.println("T1 end.");
  }
}

class R2 implements Runnable {
  @Override
  public void run() {
    for (int i = 10; i > 0; i--) {
      System.out.println("T2: " + i);
      try {
        Thread.sleep(300);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    System.out.println("T2 end.");
  }
}