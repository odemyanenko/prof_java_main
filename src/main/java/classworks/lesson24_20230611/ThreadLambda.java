package classworks.lesson24_20230611;

public class ThreadLambda {
  public static void main(String[] args) {
    Thread thread = new Thread(() -> System.out.println("Thread " + Thread.currentThread().getName()));
    thread.start();
  }
}
