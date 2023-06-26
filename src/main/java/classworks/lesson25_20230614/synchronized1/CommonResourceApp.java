package classworks.lesson25_20230614.synchronized1;

public class CommonResourceApp {
  public static void main(String[] args) {
    CommonResource resource = new CommonResource();

    for (int i = 1; i < 6; i++) {

      Thread thread = new Thread(new CommonResourceThread(resource));
      thread.start();
    }
  }
}