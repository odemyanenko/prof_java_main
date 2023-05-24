package classworks.lesson19_20230522.lessoncode;

public class Product {
  private String name;
  private Double price;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public Double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Product{" +
            "name='" + name + '\'' +
            ", price=" + price +
            '}';
  }
}
