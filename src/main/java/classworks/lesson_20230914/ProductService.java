package classworks.lesson_20230914;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
  public void addProduct(Product product) {
  }

  public void updateProduct(Product product) {
  }

  public void deleteProduct(Product product) {
  }

  public double calculatePrice(Product product) {
    return 0;
  }
}

interface ProductServiceI_Impl {
  public void addProduct(Product product);

  public void updateProduct(Product product);

  public void deleteProduct(Product product);
}

class ProductService_Impl implements ProductServiceI_Impl {
  private List<Product> products = new ArrayList<>();

  @Override
  public void addProduct(Product product) {
  }

  @Override
  public void updateProduct(Product product) {
  }

  @Override
  public void deleteProduct(Product product) {
  }
}