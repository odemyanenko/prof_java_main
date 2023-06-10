package classworks.lesson23_20230607.multithreading;

public class MyRunnableDemo {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName());
    for (int i = 0; i < 10; i++) {
      Thread thread = new Thread(new MyRunnable());
      thread.start();
    }
  }
}