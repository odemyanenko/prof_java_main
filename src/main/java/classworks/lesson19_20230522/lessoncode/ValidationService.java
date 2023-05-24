package classworks.lesson19_20230522.lessoncode;

public class ValidationService {
  public void validate(Product product){
    if (product.getName() == null) {
      throw new ProductValidationException("Product name is null");
    }
    if (product.getPrice() == null) {
      throw new ProductValidationException("Product price is null");
    }
    if (product.getPrice() < 0) {
      throw new ProductValidationException("Product price less than 0");
    }
  }
}
