package classworks.lesson24_20230611.demo1;

public class CounterDemo {
  public static void main(String[] args) throws InterruptedException {
//    Counter counter = new Counter();

    CounterRunnable counterRunnable1 = new CounterRunnable();
    CounterRunnable counterRunnable2 = new CounterRunnable();

    Thread thread1 = new Thread(counterRunnable1);
    Thread thread2 = new Thread(counterRunnable2);

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    System.out.println("count thread1 " + counterRunnable1.getCount());
    System.out.println("count thread2 " + counterRunnable2.getCount());

  }
}
