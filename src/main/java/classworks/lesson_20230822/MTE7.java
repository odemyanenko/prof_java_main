package classworks.lesson_20230822;

public class MTE7 {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("!!!!!!!!!!!!!!");
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
      Thread.sleep(1500);//1.5sec
    }
    System.out.println("@@@@@@@@@@@@");
  }
}
