package classworks.lesson24_20230611.daemon;

public class HttpConnector implements Runnable{
  @Override
  public void run() {
    while (true){
      try {
        Thread.sleep(30_000);
      }catch (InterruptedException e){

      }
    }
  }
}
