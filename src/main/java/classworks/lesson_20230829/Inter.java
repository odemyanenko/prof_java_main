package classworks.lesson_20230829;

public class Inter {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("MAIN START");
    IThread thread = new IThread();

    thread.start();
    Thread.sleep(1500);

    thread.interrupt();
    thread.join();
    System.out.println("MAIN END");
  }
}

class IThread extends Thread {
  double d = 0;

  @Override
  public void run() {
    for (int i = 0; i < 1_000_000; i++) {
      if (isInterrupted()){
        System.out.println("Somebody want the thread to interrupt");
        return;
      }
      d += Math.sqrt(i);

      try {
        Thread.sleep(300);
      } catch (InterruptedException e) {
        System.out.println("Somebody want to interrupt the thread");
        interrupt();
      }
    }
    System.out.println("SQRT = " + d);
  }
}
