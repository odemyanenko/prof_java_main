package homeworks.hw_20230814.services;

import homeworks.hw_20230814.models.Category;
import homeworks.hw_20230814.models.Product;
import homeworks.hw_20230814.repositories.WarehouseRepository;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class ProductService {
  WarehouseRepository repository;

  public ProductService(WarehouseRepository repository) {
    this.repository = repository;
  }

  //*  самый дорогой СНЭК
  public Optional<Product> getProductWithMaxPriceByCategory(String category) {
    if (category == null || category.isEmpty()) {
      throw new IllegalArgumentException("Category can not be Null");
    }
    return repository.getItems().stream()
            .filter(product -> product.getCategory().getName().equals(category))
            .max(Comparator.comparing(Product::getPrice));
  }

  //*  какого товара больше всего на складе в деньгах
  public Optional<Product> getProductWithMaxTotalPrice() {
    return repository.getItems().stream()
            .max((p1, p2) -> {
              BigDecimal value1 = p1.getPrice().multiply(BigDecimal.valueOf(p1.getQuantity()));
              BigDecimal value2 = p2.getPrice().multiply(BigDecimal.valueOf(p2.getQuantity()));
              return value1.compareTo(value2);
            });
  }

  //* какого  ДРИНКС товара меньше всего на складе в деньгах
  public Optional<Product> getProductWithMinTotalPriceByCategory(String category) {
    if (category == null || category.isEmpty()) {
      throw new IllegalArgumentException("Category can not be Null");
    }
    return repository.getItems().stream()
            .filter(p -> p.getCategory().getName().equals(category))
            .min((p1, p2) -> {
              BigDecimal value1 = p1.getPrice().multiply(BigDecimal.valueOf(p1.getQuantity()));
              BigDecimal value2 = p2.getPrice().multiply(BigDecimal.valueOf(p2.getQuantity()));
              return value1.compareTo(value2);
            });
  }

  //    *  количество видов акционного товара у ФУД
  public int getCountAdvProductByCategory(String category) {
    if (category == null || category.isEmpty()) {
      throw new IllegalArgumentException("Category can not be Null");
    }

    return (int) repository.getItems().stream()
            .filter(product -> product.getCategory().getName().equals(category) && product.isAdv())
            .count();
  }

  //    *  сгруппировать по упакованным и нет
  public Map<Boolean, List<Product>> getProductGroupByPacked() {
    return repository.getItems().stream()
            .collect(Collectors.groupingBy(Product::isPacked));
  }

  // *  у какого ДРИНКС самая высокая маржа
  public Optional<Product> getProductWithMaxMarginByCategory(String category) {
    if (category == null || category.isEmpty()) {
      throw new IllegalArgumentException("Category can not be Null");
    }

    return repository.getItems().stream()
            .filter(p -> p.getCategory().getName().equals(category))
            .max((o1, o2) -> (int) (o1.getMargin() - o2.getMargin()));
  }

  // *  средняя маржа по категории
  public Map<Category, Double> getAvgMarginGroupByCategory(){
     return repository.getItems().stream()
            .collect(Collectors.groupingBy(
                    Product::getCategory,
                    Collectors.averagingDouble(Product::getMargin)));
  }

//     *  первые три товара ФУД которые участвуют в акции и у которых самая низкая маржа
  public List<Product> getProductThreeInAdvWithMinMarginByCategory(String category){
    if (category == null || category.isEmpty()) {
      throw new IllegalArgumentException("Category can not be Null");
    }
    return repository.getItems().stream()
            .filter(product -> product.getCategory().getName().equals(category) && product.isAdv())
            .sorted((o1, o2) -> (int) (o1.getMargin() - o2.getMargin()))
            .limit(3)
            .toList();
  }

  // *  поместить в три мапу отсортировав в ай ди. #37 - это ай ди.
  public TreeMap<Integer, Product> getTreeMapProducts(){
    return repository.getItems().stream()
            .sorted(Comparator.comparingInt(Product::getId))
            .collect(Collectors.toMap(Product::getId, p -> p, (existing, replacement) -> existing, TreeMap::new));
  }

// *  самый дешевый товар которого меньше всего на складе осталось в кг или штуках в зависимости от ISPACKED
  public Optional<Product> getProductWithMinQuantityAndMinPrice(){
    return  repository.getItems().stream()
            .filter(p->p.getQuantity() > 0)
            .collect(Collectors.groupingBy(Product::isPacked))
            .values()
            .stream()
            .map(group -> group.stream()
                    .min(Comparator.comparingDouble(Product::getQuantity)
                            .thenComparing(Product::getPrice))
                    .orElse(null))
            .filter(Objects::nonNull)
            .min(Comparator.comparingDouble(Product::getQuantity)
                    .thenComparing(Product::getPrice));
  }
}
