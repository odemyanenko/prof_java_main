package homeworks.hw_20230814.models;

import java.math.BigDecimal;

public class Product {
  private int id;
  private String name;
  private Factory factory;
  private Category category;
  private boolean isPacked;
  private boolean isAdv;
  private BigDecimal price;
  private double margin;
  private int quantity;
}
