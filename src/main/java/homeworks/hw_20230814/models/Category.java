package homeworks.hw_20230814.models;

import java.util.UUID;

public class Category {
  private int id;
  private String name;
  private static int idCounter;

  {
    idCounter = 0;
  }

  public Category(String name) {
    this.id = ++idCounter;
    this.name = name;
  }
}
