package classworks.lesson_20230822;

public class MTE4 {
  public static void main(String[] args) {
    new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 100; i++) {
          System.out.println("Run1: " + i);
        }
      }
    }).start();
  }
}
