package homeworks.hw_20230814;

import homeworks.hw_20230814.repositories.WarehouseRepository;
import homeworks.hw_20230814.services.FactoryService;
import homeworks.hw_20230814.services.ProductService;
import homeworks.hw_20230814.services.utils.LoadWarehouseUtil;

public class WarehouseApp {
  public static void main(String[] args) {
    WarehouseRepository repository = new WarehouseRepository();

    FactoryService factorService = new FactoryService(repository);
    ProductService productService = new ProductService(repository);
    LoadWarehouseUtil util = new LoadWarehouseUtil();

    util.getDataFromJSON(repository, "/report.json");

    System.out.println("1. ай ди всех компаний");
    System.out.println(factorService.getIdAllFactories());

    System.out.println("-----------------------------------------");
    System.out.println("2. самый дорогой СНЭК");
    System.out.println(productService.getProductWithMaxPriceByCategory("SNACKS"));

    System.out.println("-----------------------------------------");
    System.out.println("3. какого товара больше всего на складе в деньгах");
    System.out.println(productService.getProductWithMaxTotalPrice());

    System.out.println("-----------------------------------------");
    System.out.println("4. какого  ДРИНКС товара меньше всего на складе в деньгах");
    System.out.println(productService.getProductWithMinTotalPriceByCategory("DRINKS"));

    System.out.println("-----------------------------------------");
    System.out.println("5. количество видов акционного товара у ФУД");
    System.out.println(productService.getCountAdvProductByCategory("FOOD"));

    System.out.println("-----------------------------------------");
    System.out.println("6. сгруппировать по упакованным и нет");
    System.out.println(productService.getProductGroupByPacked().entrySet().stream().toList());

    System.out.println("-----------------------------------------");
    System.out.println("7. у какого ДРИНКС самая высокая маржа");
    System.out.println(productService.getProductWithMaxMarginByCategory("DRINKS"));

    System.out.println("-----------------------------------------");
    System.out.println("8. средняя маржа по категории");
    System.out.println(productService.getAvgMarginGroupByCategory());

    System.out.println("-----------------------------------------");
    System.out.println("9. первые три товара ФУД которые участвуют в акции и у которых самая низкая маржа");
    System.out.println(productService.getProductThreeInAdvWithMinMarginByCategory("FOOD"));

    System.out.println("-----------------------------------------");
    System.out.println("10. поместить в три мапу отсортировав в ай ди. #37 - это ай ди.");
    System.out.println(productService.getTreeMapProducts());

    System.out.println("-----------------------------------------");
    System.out.println("11. самый дешевый товар которого меньше всего на складе осталось в кг или штуках в зависимости от ISPACKED");
    System.out.println(productService.getProductWithMinQuantityAndMinPrice());
  }
}