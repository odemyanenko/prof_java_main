package classworks.lesson25_20230614.synchronized4;

public class Store {
  private int product = 0;

  public synchronized void get(){
    if (product < 1) {
      try {
        wait();
      } catch (InterruptedException e) {
      }
    }
    product--;
    System.out.println("Покупатель купил 1 товар");
    System.out.println("Товаров на складе " + product);
    notify();
  }

  public synchronized void put(){
    if (product > 5) {
      try {
        wait();
      } catch (InterruptedException e) {
      }
    }

    product++;
    System.out.println("Производитель добавил 1 товар");
    System.out.println("Товаров на складе " + product);
    notify();
  }

}