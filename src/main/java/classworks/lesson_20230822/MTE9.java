package classworks.lesson_20230822;

public class MTE9 extends Thread {
  volatile boolean b = true;
//  boolean b = true;

  @Override
  public void run() {
    long counter = 0;
    while (b) {
      counter++;
    }
    System.out.println("Counter: " + counter);
  }

  public static void main(String[] args) throws InterruptedException {
    MTE9 t1 = new MTE9();
    t1.start();
    Thread.sleep(1500);
    System.out.println("Wake UP NEO!");
    t1.b = false;
    t1.join();
    System.out.println("Main End.");
  }
}
