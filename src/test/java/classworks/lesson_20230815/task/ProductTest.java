package classworks.lesson_20230815.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {
  private static final Product PRODUCT_BASE = new Product("product1", 20, 2, "category1");

  @Test
  public void getTotalPriceTest() {
    double excepted = 40;
    Assertions.assertEquals(excepted, PRODUCT_BASE.getTotalPrice());
  }

  @Test
  public void isAvailableTest() {
    Product product = new Product("product1", 20, 2, "category1");
    Assertions.assertTrue(PRODUCT_BASE.isAvailable());

  }

  @Test
  public void isNotAvailableTest() {
    Product product = new Product("product2", 10, 0, "category2");
    Assertions.assertFalse(product.isAvailable());
  }
}