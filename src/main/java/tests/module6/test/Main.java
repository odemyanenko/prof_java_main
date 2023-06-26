package tests.module6.test;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
  public static class Test extends Thread {
    @Override
    public void run() {
      if (Thread.currentThread().isDaemon()){
        System.out.println("daemon thread work");
      }
      else {
        System.out.println("user thread work");
      }
    }
  }
  public static void main(String[] args) {
    Test t1 = new Test();
    Test t2 = new Test();

    t1.start();
    t2.start();
    t1.setDaemon(true);
  }
}
