package classworks.lesson24_20230611.interrupted.sleep;

import java.util.concurrent.TimeUnit;

public class HelloWorldApp {
  public static void main(String[] args) {

    Runnable task = () -> {
      try {
        int secWait = 10;
        System.out.println("Thread is starting ...");
        Thread.sleep(secWait * 1000);
        //TimeUnit.SECONDS.sleep(...);
        System.out.println("Thread is finish ...");
      } catch (InterruptedException e) {}
    };

    Thread thread = new Thread(task);
    thread.start();
  }
}