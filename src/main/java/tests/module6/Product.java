package tests.module6;

import java.util.concurrent.atomic.AtomicInteger;

public class Product {
  private final int id;
  private final String name;
  public static AtomicInteger count = new AtomicInteger(1);

  public Product() {
    this.id = count.getAndIncrement();
    this.name = "Product " + this.id;
  }

  @Override
  public String toString() {
    return name;
  }
}
