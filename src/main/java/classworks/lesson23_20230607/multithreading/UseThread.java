package classworks.lesson23_20230607.multithreading;

public class UseThread {
  public static void main(String[] args) throws InterruptedException {

    Thread thread = new Thread(() -> {
      try {
        Thread.sleep(10000);
        System.out.println("Hello world!");
        System.out.println("Finished thread");
      }catch (InterruptedException e){}
    });

    System.out.println("Start program");
    System.out.println("Pause 5 sec");
    thread.start();
    Thread.sleep(5000);
    System.out.println("Finished program");

    int count = 0;
    for (int i = 0; i < 500000000; i++) {
      count++;
    }
    System.out.println(count);
  }
}