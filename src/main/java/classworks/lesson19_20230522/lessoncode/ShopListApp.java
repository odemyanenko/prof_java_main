package classworks.lesson19_20230522.lessoncode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShopListApp {
  public static void main(String[] args) {
    ValidationService validationService = new ValidationService();
    ProductService productService = new ProductService(validationService);

    while (true) {
      Scanner scanner = new Scanner(System.in);
      try {
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();

        System.out.println("Enter price: ");
        double price = scanner.nextDouble();

        Product product = new Product(name, price);
        productService.add(product);
      }
      catch (ProductValidationException e) {
        System.out.println("Validation failed");
        System.out.println(e.getMessage());
      }
      catch (NumberFormatException e){
        System.out.println("Incorrect number entered");
      }
      catch (InputMismatchException e){
        System.out.println("Incorrect input entered");
      }
      catch (Exception e){
        e.printStackTrace();
      }
    }
  }
}
