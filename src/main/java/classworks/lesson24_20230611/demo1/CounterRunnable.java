package classworks.lesson24_20230611.demo1;

public class CounterRunnable implements Runnable{
//  private final Counter counter;
//
//  public CounterRunnable(Counter counter) {
//    this.counter = counter;
//  }

  private int count = 0;

  public int getCount() {
    return count;
  }

  @Override
  public void run() {
    for (int i = 0; i < 1_000_000; i++) {
      count++;
//      counter.increment();
    }
  }
}
