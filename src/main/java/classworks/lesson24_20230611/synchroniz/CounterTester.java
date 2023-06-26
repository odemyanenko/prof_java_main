package classworks.lesson24_20230611.synchroniz;

public class CounterTester {
  public static void main(String[] args) throws InterruptedException {
    Counter counter = new Counter();

    for (int i = 0; i < 10; i++) {
      CounterThread counterThread = new CounterThread(counter);
      counterThread.start();
    }

    Thread.sleep(3000);

    System.out.println("Counter = " + counter.getCounter());
  }
}