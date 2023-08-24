package homeworks.hw_20230814.repositories;

import homeworks.hw_20230814.models.Category;
import homeworks.hw_20230814.models.Factory;
import homeworks.hw_20230814.models.Product;

import java.util.*;

public class WarehouseRepository {
  private List<Product> items;
  private Set<Category> categories;
  private Set<Factory> factories;

  public WarehouseRepository() {
    this.items = new ArrayList<>();
    this.categories = new HashSet<>();
    this.factories = new HashSet<>();
  }

  public Set<Category> getCategories() {
    return Collections.unmodifiableSet(categories);
  }

  public Set<Factory> getFactories() {
    return Collections.unmodifiableSet(factories);
  }

  public List<Product> getItems() {
    return Collections.unmodifiableList(items);
  }
  public void addProduct(Product product){
    if (product == null) {
      throw new IllegalArgumentException("Product can not be Null");
    }
    this.items.add(product);
  }
  public Category addCategory(String categoryName) {
    Optional<Category> categoryOptional = categories.stream()
            .filter(e -> e.getName().equals(categoryName))
            .findFirst();
    if (categoryOptional.isPresent()) {
      return categoryOptional.get();
    } else {
      Category category = new Category(categoryName);
      categories.add(category);
      return category;
    }
  }

  public Factory addFactory(String factoryName, boolean isDept) {
    Optional<Factory> factoryOptional = factories.stream()
            .filter(e -> e.getName().equals(factoryName))
            .findFirst();
    if (factoryOptional.isPresent()) {
      return factoryOptional.get();
    } else {
      Factory factory = new Factory(factoryName, isDept);
      factories.add(factory);
      return factory;
    }
  }
}
