package classworks.lesson_20230822;

public class MTE3 {
  public static void main(String[] args) {
    Thread t1 = new Thread(new MyR1());
    Thread t2 = new Thread(new MyR2());

    t1.start();
    t2.start();

    System.out.println("###############");
  }
}

class MyR1 implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("MyR1: " + i);
    }
  }
}

class MyR2 implements Runnable {
  @Override
  public void run() {
    for (int i = 100; i > 0; i--) {
      System.out.println("MyR2: " + i);
    }
  }
}