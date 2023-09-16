package classworks.lesson_20230829;

// daemon Thread
public class DE {
  public static void main(String[] args) {
    System.out.println("MAIN START");

    UT ut = new UT();
    ut.setName("USER THREAD");

    DT dt = new DT();
    dt.setName("DAEMON THREAD");

    dt.setDaemon(true);

    ut.start();
    dt.start();

    System.out.println("MAIN END");
  }
}

class UT extends Thread {
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " : isDaemon " + isDaemon());
    for (char i = 'A'; i <= 'Z'; i++) {
      try {
        Thread.sleep(400);
        System.out.println("CHAR: " + i);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}

class DT extends Thread {
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " : isDaemon " + isDaemon());
    for (int i = 0; i < 50; i++) {
      try {
        Thread.sleep(300);
        System.out.println("INT: " + i);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}