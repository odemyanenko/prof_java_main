package homeworks.hw_20230814.services;

import homeworks.hw_20230814.models.Category;
import homeworks.hw_20230814.models.Factory;
import homeworks.hw_20230814.models.Product;
import homeworks.hw_20230814.repositories.WarehouseRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
  @Mock
  WarehouseRepository repository;

  @InjectMocks
  ProductService productService = new ProductService(repository);
  List<Product> products = new ArrayList<>();

  Product product1;
  Product product2;
  Product product3;

  Category category1;
  Category category3;
  Factory factory1;

  @BeforeEach
  void init() {
    category1 = new Category("category1");
    category3 = new Category("category3");

    factory1 = new Factory("factory1", false);

    product1 = new Product(1, "product1", factory1, category1, false, true, BigDecimal.valueOf(100.00), 2.0, 10);
    product2 = new Product(2, "product2", factory1, category1, false, false, BigDecimal.valueOf(200.00), 1.0, 20);
    product3 = new Product(3, "product3",
            new Factory("factory2", true),
            category3,
            true,true, BigDecimal.valueOf(400.00), 3.5, 15);

    products.add(product1);
    products.add(product2);
    products.add(product3);
  }

  @Test
  void getProductWithMaxPriceByCategoryNullWithExceptionTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> productService.getProductWithMaxPriceByCategory(null));
  }

  @Test
  void getProductWithMaxPriceByCategoryEmptyWithExceptionTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> productService.getProductWithMaxPriceByCategory(""));
  }

  @Test
  void getProductWithMaxPriceByCategoryNotExistsTest() {
    when(repository.getItems()).thenReturn(products);
    Optional<Product> productOptional = productService.getProductWithMaxPriceByCategory("category5");

    assertFalse(productOptional.isPresent());
    verify(repository, times(1)).getItems();
  }

  @Test
  void getProductWithMaxPriceByCategoryTest() {
    when(repository.getItems()).thenReturn(products);
    Optional<Product> productOptional = productService.getProductWithMaxPriceByCategory("category1");

    assertTrue(productOptional.isPresent());
    assertEquals(BigDecimal.valueOf(200.0), productOptional.get().getPrice());
    verify(repository, times(1)).getItems();
  }

  @Test
  public void getProductWithMaxTotalPriceTest() {
    when(repository.getItems()).thenReturn(products);
    Optional<Product> productOptional = productService.getProductWithMaxTotalPrice();

    assertTrue(productOptional.isPresent());
    assertEquals(3, productOptional.get().getId());
    verify(repository, times(1)).getItems();
  }

  @Test
  void getProductWithMinTotalPriceByCategoryNullWithExceptionTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> productService.getProductWithMinTotalPriceByCategory(null));
  }

  @Test
  void getProductWithMinTotalPriceByCategoryEmptyWithExceptionTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> productService.getProductWithMinTotalPriceByCategory(""));
  }

  @Test
  void getProductWithMinTotalPriceByCategoryTest() {
    when(repository.getItems()).thenReturn(products);
    Optional<Product> productOptional = productService.getProductWithMinTotalPriceByCategory("category1");

    assertTrue(productOptional.isPresent());
    assertEquals(1, productOptional.get().getId());
    verify(repository, times(1)).getItems();
  }

  @Test
  void getCountAdvProductByCategoryNullWithExceptionTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> productService.getCountAdvProductByCategory(null));
  }

  @Test
  void getCountAdvProductByCategoryEmptyWithExceptionTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> productService.getCountAdvProductByCategory(""));
  }

  @Test
  void getCountAdvProductByCategoryTest() {
    when(repository.getItems()).thenReturn(products);

    int actualCount = productService.getCountAdvProductByCategory("category1");
    int excepted = 1;

    assertEquals(excepted, actualCount);
    verify(repository, times(1)).getItems();
  }

  @Test
  void getCountAdvProductByCategoryNotExistsTest() {
    when(repository.getItems()).thenReturn(products);

    int actualCount = productService.getCountAdvProductByCategory("category4");
    int excepted = 0;

    assertEquals(excepted, actualCount);
    verify(repository, times(1)).getItems();
  }

  @Test
  void getProductGroupByPackedTest() {
    when(repository.getItems()).thenReturn(products);

    Map<Boolean, List<Product>> actual = productService.getProductGroupByPacked();

    Map<Boolean, List<Product>> excepted = new HashMap<>();
    excepted.put(true, List.of(product3));
    excepted.put(false, List.of(product1, product2));

    assertEquals(excepted, actual);
    verify(repository, times(1)).getItems();
  }

  @Test
  void getProductWithMaxMarginByCategoryNullWithExceptionTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> productService.getProductWithMaxMarginByCategory(null));
  }

  @Test
  void getProductWithMaxMarginByCategoryEmptyWithExceptionTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> productService.getProductWithMaxMarginByCategory(""));
  }

  @Test
  void getProductWithMaxMarginByCategoryTest() {
    when(repository.getItems()).thenReturn(products);
    Optional<Product> productOptional = productService.getProductWithMaxMarginByCategory("category1");

    assertTrue(productOptional.isPresent());
    assertEquals(1, productOptional.get().getId());
    verify(repository, times(1)).getItems();
  }

  @Test
  void getProductWithMaxMarginByCategoryNotExistsTest() {
    when(repository.getItems()).thenReturn(products);
    Optional<Product> productOptional = productService.getProductWithMaxMarginByCategory("category4");

    assertFalse(productOptional.isPresent());
    verify(repository, times(1)).getItems();
  }

  @Test
  void getAvgMarginGroupByCategoryTest() {
    when(repository.getItems()).thenReturn(products);

    Map<Category, Double> actual = productService.getAvgMarginGroupByCategory();

    Map<Category, Double> excepted = new HashMap<>();
    excepted.put(category1, (1.0 + 2.0)/2);
    excepted.put(category3, 3.5);

    assertEquals(excepted, actual);
    verify(repository, times(1)).getItems();
  }

  @Test
  void getProductThreeInAdvWithMinMarginByCategoryNullWithExceptionTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> productService.getProductThreeInAdvWithMinMarginByCategory(null));
  }

  @Test
  void getProductThreeInAdvWithMinMarginByCategoryEmptyWithExceptionTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> productService.getProductThreeInAdvWithMinMarginByCategory(""));
  }
  @Test
  void getProductThreeInAdvWithMinMarginByCategoryTest() {
    Product product4 = new Product(4, "product4", factory1, category1, false, true, BigDecimal.valueOf(100.00), 2.0, 10);
    Product product5 = new Product(5, "product5", factory1, category1, false, true, BigDecimal.valueOf(200.00), 5.0, 10);
    Product product6 = new Product(6, "product6", factory1, category1, false, true, BigDecimal.valueOf(300.00), 0.0, 10);
    products.add(product4);
    products.add(product5);
    products.add(product6);

    when(repository.getItems()).thenReturn(products);

    List<Product> actual = productService.getProductThreeInAdvWithMinMarginByCategory("category1");

    List<Product> excepted = new ArrayList<>();
    excepted.add(product6);
    excepted.add(product1);
    excepted.add(product4);

    assertEquals(excepted, actual);
    verify(repository, times(1)).getItems();
  }

  @Test
  void getProductThreeInAdvWithMinMarginByCategoryNotExistsTest() {
    when(repository.getItems()).thenReturn(products);

    List<Product> actual = productService.getProductThreeInAdvWithMinMarginByCategory("category4");

    assertTrue(actual.isEmpty());
    verify(repository, times(1)).getItems();
  }

  @Test
  void getTreeMapProductsTest() {
    when(repository.getItems()).thenReturn(products);

    TreeMap<Integer, Product> actual = productService.getTreeMapProducts();
    TreeMap<Integer, Product> excepted = new TreeMap<>();
    excepted.put(1, product1);
    excepted.put(2, product2);
    excepted.put(3, product3);

    assertEquals(excepted, actual);
    verify(repository, times(1)).getItems();
  }

  @Test
  void getProductWithMinQuantityAndMinPriceTest() {
    when(repository.getItems()).thenReturn(products);

    Optional<Product> productOptional = productService.getProductWithMinQuantityAndMinPrice();

    assertTrue(productOptional.isPresent());
    assertEquals(1, productOptional.get().getId());
    verify(repository, times(1)).getItems();
  }
}