package classworks.lesson12_20230424.products;

public class Product {
  private int id;
  private String title;
  private Double price;

  private static int maxId;

  static {
    maxId = 0;
  }

  public Product(String title, Double price) {
    this.id = getNextId();
    this.title = title;
    this.price = price;
  }

  private int getNextId(){
    return ++maxId;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public String toString() {
    return "Product{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", price=" + price +
            '}';
  }
}
