package tests.module6.test;

public class Main2 {
  public static void main(String[] args) throws InterruptedException {
    Thread thread1 = new Thread(() -> System.out.println("1"));
    Thread thread2 = new Thread(() -> System.out.println("2"));
    Thread thread3 = new Thread(() -> System.out.println("3"));

    thread1.start();
    thread2.start();
    thread3.start();

    thread1.join();
    thread2.join();
    thread3.join();

    System.out.println("4");
  }
}
