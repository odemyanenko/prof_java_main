package classworks.lesson_20230822;

public class MTE6 implements Runnable{
  @Override
  public void run() {
    System.out.println("run(). The name: " + Thread.currentThread().getName());
  }

  public static void main(String[] args) {
    Thread thread = new Thread(new MTE6());
    thread.start();//run() - not start Thread!!! ONLY - start()
    System.out.println("main(). The name: " + Thread.currentThread().getName());
  }
}
