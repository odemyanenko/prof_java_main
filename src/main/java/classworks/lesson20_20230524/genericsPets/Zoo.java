package classworks.lesson20_20230524.genericsPets;

public class Zoo<T> {
  private T item;

  public Zoo(T item) {
    this.item = item;
  }

  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  }
}
