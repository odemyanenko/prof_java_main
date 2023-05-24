package classworks.lesson19_20230522.lessoncode;

public class ProductService {
  private final ValidationService validationService;

  public ProductService(ValidationService validationService) {
    this.validationService = validationService;
  }

  public void add(Product product){
    validationService.validate(product);
    System.out.println("Success add new product!");
  }
}
