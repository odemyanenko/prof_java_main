package classworks.lesson23_20230607.multithreading;

public class MyRunnable implements Runnable{
  @Override
  public void run() {
    System.out.println("I'm Thread! My name is " + Thread.currentThread().getName());
  }
}