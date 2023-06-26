package classworks.lesson24_20230611.synchroniz;

public class CounterThread extends Thread{

  private final Counter counter;

  public CounterThread(Counter counter) {
    this.counter = counter;
  }

  @Override
  public void run(){
    for (int i = 0; i < 1000; i++) {
      counter.increment();
    }
  }
}