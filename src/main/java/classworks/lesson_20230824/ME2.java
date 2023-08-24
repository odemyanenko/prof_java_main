package classworks.lesson_20230824;

public class ME2 {
  static int counter = 0;

//  public synchronized static void increment() {
//    counter++;
//    System.out.println("NAME: " + Thread.currentThread().getName() + " || COUNT: " + counter);
//  }

  public static void increment() {
    synchronized (ME2.class){
      counter++;
    }
    System.out.println("NAME: " + Thread.currentThread().getName() + " || COUNT: " + counter);
  }

  public static void main(String[] args) {
    RII ri = new RII();

    Thread tr1 = new Thread(ri);
    Thread tr2 = new Thread(ri);
    Thread tr3 = new Thread(ri);

    tr1.start();
    tr2.start();
    tr3.start();
  }
}

class RII implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 4; i++) {
      ME2.increment();
    }
  }
}
