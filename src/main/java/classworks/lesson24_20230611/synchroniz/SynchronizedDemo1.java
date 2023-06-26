package classworks.lesson24_20230611.synchroniz;

public class SynchronizedDemo1 {
    /*

    Модификатор доступа
    synchronized return_type MethodName(parameters() {
    ...}


    Оператор:

    synchronized(reference) {
    //операторы которые мы хотим синхронизировать
    // ....}

     */

  public static void main(String[] args) throws InterruptedException {

    Object objLock = new Object();

    Runnable task = () -> {

      synchronized (objLock) {

        System.out.println("Thread: " + Thread.currentThread().getName());

      }

    };

    Thread thread = new Thread(task);
    thread.start();

    Thread.sleep(1);

    synchronized (objLock) {
      for (int i = 0; i < 8; i++) {
        System.out.println(thread.getState());
        Thread.currentThread().sleep(1000);
        System.out.println(" " + i);
      }
      System.out.println("....... ");
    }

  }
}