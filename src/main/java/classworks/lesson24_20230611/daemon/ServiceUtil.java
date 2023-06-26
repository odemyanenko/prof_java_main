package classworks.lesson24_20230611.daemon;

public class ServiceUtil {
  public static void main(String[] args) {
    DatabaseServer dbs = new DatabaseServer();
    Thread thread1 = new Thread(dbs);

    thread1.setDaemon(true);
    thread1.start();

    HttpConnector hc = new HttpConnector();
    Thread thread2 = new Thread(hc);

    thread2.setDaemon(true);
    thread2.start();


  }
}
