package classworks.lesson12_20230424.products;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ProductManager {
  private HashMap<Integer, Product> products = new HashMap<>();

  public void addProduct (int productId, Product product){
    if (!products.containsKey(productId)){
      products.put(productId, product);
      System.out.println("product with id = " + productId + " added!");
    }
    else {
      System.out.println("product with id = " + productId + " already exists!");
    }
  }

  public void getCatalog(){
    System.out.println(products);
  }

  public void deleteProduct(int productId){
    if (products.containsKey(productId)){
      products.remove(productId);
      System.out.println("product with id = " + productId + " removed!");
    }
    else {
      System.out.println("product with id = " + productId + " not exists!");
    }
  }

  public Product findProduct(int productID){
    return products.getOrDefault(productID, null);
  }
}
