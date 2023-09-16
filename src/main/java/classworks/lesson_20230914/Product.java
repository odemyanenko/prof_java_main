package classworks.lesson_20230914;

import java.util.List;

public class Product {
  private String name;
  private double price;

  public void saveToDatabase() {

  }

  public void generateInvoice() {

  }

  public void sendEmailConfirmation() {

  }
}

class Product_Impl {
  private String name;
  private double price;

  public double calculatePrice(Product product) {
    return price;
  }
}

class Repository_Impl {
  private List<Product_Impl> list;

  public void saveToDatabase(Product_Impl product) {

  }
}

class Service_Impl {
  private Repository_Impl repository;

  public void generateInvoice() {
  }

  public void sendEmailConfirmation() {
  }
}