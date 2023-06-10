package classworks.lesson23_20230607.multithreading;

public class MyFirstThreadDemo {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName());
    for (int i = 0; i < 10; i++) {
      MyFirstThread thread = new MyFirstThread();
      thread.start();
    }
  }
}