package homeworks.hw_20230814.models;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
  private final int id;
  private String name;
  private Factory factory;
  private Category category;
  private boolean isPacked;
  private boolean isAdv;
  private BigDecimal price;
  private double margin;
  private int quantity;

  public Product(int id, String name, Factory factory, Category category, boolean isPacked, boolean isAdv, BigDecimal price, double margin, int quantity) {
    this.id = id;
    this.name = name;
    this.factory = factory;
    this.category = category;
    this.isPacked = isPacked;
    this.isAdv = isAdv;
    this.price = price;
    this.margin = margin;
    this.quantity = quantity;
  }

  public int getId() {
    return id;
  }

  public double getMargin() {
    return margin;
  }

  public boolean isPacked() {
    return isPacked;
  }

  public boolean isAdv() {
    return isAdv;
  }

  public int getQuantity() {
    return quantity;
  }
  public BigDecimal getPrice() {
    return price;
  }

  public Factory getFactory() {
    return factory;
  }

  public Category getCategory() {
    return category;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Product product)) return false;
    return id == product.id && name.equals(product.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    return "Product{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", factory=" + factory +
            ", category=" + category +
            ", isPacked=" + isPacked +
            ", isAdv=" + isAdv +
            ", price=" + price +
            ", margin=" + margin +
            ", quantity=" + quantity +
            '}';
  }
}
